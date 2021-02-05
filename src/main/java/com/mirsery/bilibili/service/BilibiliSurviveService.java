package com.mirsery.bilibili.service;

import com.mirsery.bilibili.dto.FollowDto;
import com.mirsery.bilibili.dto.FollowDto.DataDTO.ListDTO;
import com.mirsery.bilibili.dto.SurviveDto;
import com.mirsery.bilibili.dto.SurviveDto.ResultDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: bilibi-calendar
 * @description:
 * @author: misery
 * @create: 2021-02-04 09:20
 **/
@Service
public class BilibiliSurviveService {


    private SurviveDto getSurvive(String url) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, SurviveDto.class);
    }

    public SurviveDto getCnSurvive() {
        String cnSurviveURL = "https://bangumi.bilibili.com/web_api/timeline_cn";
        return getSurvive(cnSurviveURL);
    }

    public SurviveDto getGlobalSurvive() {
        String globalSurviveURL = "https://bangumi.bilibili.com/web_api/timeline_global";
        return getSurvive(globalSurviveURL);
    }


    public FollowDto getFollows(String uuid) {
        return getFollows(uuid, 1, 20);
    }

    public FollowDto getFollows(String uuid, int pn, int ps) {
        //获取追番列表
        RestTemplate restTemplate = new RestTemplate();
        String followURL =
                "https://api.bilibili.com/x/space/bangumi/follow/list?type=1&vmid=" + uuid + "&pn=" + pn + "&ps=" + ps;

        return restTemplate.getForObject(followURL, FollowDto.class);
    }

    public HashMap<Integer, ListDTO> getListDto(String uuid) {
        HashMap<Integer, ListDTO> seasonsFollow = new HashMap<>();
        int pn = 1, ps = 20;
        FollowDto followDto = getFollows(uuid);
        followDto.getData().getList().forEach(item -> {
            if (item.getIsFinish() == 0) {
                seasonsFollow.put(item.getSeasonId(), item);
            }
        });
        while (followDto.getData().getTotal() - 20 * pn > 0) {
            pn++;
            followDto = getFollows(uuid, pn, ps);
            followDto.getData().getList().forEach(item -> {
                if (item.getIsFinish() == 0) {
                    seasonsFollow.put(item.getSeasonId(), item);
                }
            });
        }
        return seasonsFollow;
    }

    /**
     * 获取所追新番的日历内容
     **/
    public List<ResultDTO> getSurviveFollowsList(HashMap<Integer, ListDTO> seasonsFollow) {
        SurviveDto cnSurviveDto = getCnSurvive();
        SurviveDto globalSurviveDto = getGlobalSurvive();

        // step 2 过滤并生成关注番剧/国创的最近播放列表
        List<ResultDTO> tempList = new ArrayList<>();
        doSurviveFollowsList(seasonsFollow, cnSurviveDto, tempList);
        doSurviveFollowsList(seasonsFollow, globalSurviveDto, tempList);
        return tempList;
    }

    private void doSurviveFollowsList(HashMap<Integer, ListDTO> seasonsFollow, SurviveDto globalSurviveDto,
            List<ResultDTO> tempList) {
        globalSurviveDto.getResult().forEach(item -> {
            ResultDTO resultTemp = new ResultDTO();
            resultTemp.setDate(item.getDate());
            resultTemp.setDateTs(item.getDateTs());
            resultTemp.setIsToday(item.getIsToday());
            resultTemp.setDayOfWeek(item.getDayOfWeek());
            resultTemp.setSeasons(
                    item.getSeasons().stream().filter(season -> seasonsFollow.containsKey(season.getSeasonId()))
                            .collect(Collectors.toList()));
            tempList.add(resultTemp);
        });
    }

}
