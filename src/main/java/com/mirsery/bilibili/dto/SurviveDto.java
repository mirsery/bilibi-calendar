package com.mirsery.bilibili.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * @program: bilibi-calendar
 * @description:
 * @author: misery
 * @create: 2021-02-04 09:21
 **/
public class SurviveDto {
    @JsonProperty("code")
    private Integer code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("result")
    private List<ResultDTO> result;

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

    public List<ResultDTO> getResult() {
        return result;
    }

    public void setResult(List<ResultDTO> result) {
        this.result = result;
    }

    public static class ResultDTO {

        /**
         * date 日期
         * **/
        @JsonProperty("date")
        private String date;
        /**
         * date 日期timestamp
         * **/
        @JsonProperty("date_ts")
        private Integer dateTs;
        /**
         *
         * */
        @JsonProperty("day_of_week")
        private Integer dayOfWeek;
        @JsonProperty("is_today")
        private Integer isToday;
        @JsonProperty("seasons")
        private List<SeasonsDTO> seasons;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Integer getDateTs() {
            return dateTs;
        }

        public void setDateTs(Integer dateTs) {
            this.dateTs = dateTs;
        }

        public Integer getDayOfWeek() {
            return dayOfWeek;
        }

        public void setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
        }

        public Integer getIsToday() {
            return isToday;
        }

        public void setIsToday(Integer isToday) {
            this.isToday = isToday;
        }

        public List<SeasonsDTO> getSeasons() {
            return seasons;
        }

        public void setSeasons(List<SeasonsDTO> seasons) {
            this.seasons = seasons;
        }

        public static class SeasonsDTO {

            @JsonProperty("cover")
            private String cover; //封面

            @JsonProperty("delay")
            private Integer delay;

            @JsonProperty("ep_id")
            private Integer epId;

            @JsonProperty("favorites")
            private Integer favorites;

            @JsonProperty("follow")
            private Integer follow;

            @JsonProperty("is_published")
            private Integer isPublished;
            @JsonProperty("pub_index")

            private String pubIndex;
            @JsonProperty("pub_time")
            private String pubTime;

            @JsonProperty("pub_ts")
            private Integer pubTs; //更新时间

            @JsonProperty("season_id")
            private Integer seasonId;

            @JsonProperty("season_status")
            private Integer seasonStatus;

            @JsonProperty("square_cover")
            private String squareCover;//封面

            @JsonProperty("title")
            private String title;//标题

            @JsonProperty("url")
            private String url;//播放地址

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public Integer getDelay() {
                return delay;
            }

            public void setDelay(Integer delay) {
                this.delay = delay;
            }

            public Integer getEpId() {
                return epId;
            }

            public void setEpId(Integer epId) {
                this.epId = epId;
            }

            public Integer getFavorites() {
                return favorites;
            }

            public void setFavorites(Integer favorites) {
                this.favorites = favorites;
            }

            public Integer getFollow() {
                return follow;
            }

            public void setFollow(Integer follow) {
                this.follow = follow;
            }

            public Integer getIsPublished() {
                return isPublished;
            }

            public void setIsPublished(Integer isPublished) {
                this.isPublished = isPublished;
            }

            public String getPubIndex() {
                return pubIndex;
            }

            public void setPubIndex(String pubIndex) {
                this.pubIndex = pubIndex;
            }

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public Integer getPubTs() {
                return pubTs;
            }

            public void setPubTs(Integer pubTs) {
                this.pubTs = pubTs;
            }

            public Integer getSeasonId() {
                return seasonId;
            }

            public void setSeasonId(Integer seasonId) {
                this.seasonId = seasonId;
            }

            public Integer getSeasonStatus() {
                return seasonStatus;
            }

            public void setSeasonStatus(Integer seasonStatus) {
                this.seasonStatus = seasonStatus;
            }

            public String getSquareCover() {
                return squareCover;
            }

            public void setSquareCover(String squareCover) {
                this.squareCover = squareCover;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
