package com.mirsery.bilibili.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * @program: bilibi-calendar
 * @description:
 * @author: misery
 * @create: 2021-02-04 10:10
 **/
public class SurviveFollowDto {

    @JsonProperty("code")
    private Integer code;
    @JsonProperty("message")
    private String message;

    @JsonProperty("data")
    private List<Survivefollow> data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Survivefollow> getData() {
        return data;
    }

    public void setData(List<Survivefollow> data) {
        this.data = data;
    }

    public static class Survivefollow{
        private String summary;//主题
        private String location;//级数
        private String desc;//番剧描述
        private String image;//番剧封面
        private String play;//播放地址
        private String startTime;//更新开始时间
        private String endTime;//更新结束时间

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getPlay() {
            return play;
        }

        public void setPlay(String play) {
            this.play = play;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }
    }
}
