package com.mirsery.bilibili;

import com.mirsery.bilibili.dto.FollowDto.DataDTO.ListDTO;
import com.mirsery.bilibili.dto.SurviveDto.ResultDTO;
import com.mirsery.bilibili.service.BilibiliSurviveService;
import com.mirsery.bilibili.service.CalendarService;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.component.CalendarComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: bilibi-calendar
 * @description:
 * @author: misery
 * @create: 2021-02-04 22:42
 **/
@RestController
public class BilibiliController {

    @Autowired
    private BilibiliSurviveService bilibiliSurviveService;

    @Autowired
    private CalendarService calendarService;

    @GetMapping("/subscribe/{uuid}")
    public String getCalendar(@PathVariable String uuid) throws ParseException, IOException, URISyntaxException {
        Calendar calendar = calendarService.generateCalendar();
        HashMap<Integer, ListDTO> seasonsFollow = bilibiliSurviveService.getListDto(uuid);
        List<ResultDTO> list = new BilibiliSurviveService().getSurviveFollowsList(seasonsFollow);
        List<CalendarComponent> components = calendarService.generateCalendarComponent(list, seasonsFollow);
        calendar.getComponents().addAll(components);
        return calendar.toString();
    }

}