package com.mirsery.bilibili.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * @program: bilibi-calendar
 * @description:
 * @author: misery
 * @create: 2021-02-04 09:53
 **/
public class FollowDto {
    @JsonProperty("code")
    private Integer code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("ttl")
    private Integer ttl;
    @JsonProperty("data")
    private DataDTO data;

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

    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public static class DataDTO {

        @JsonProperty("list")
        private List<ListDTO> list;
        @JsonProperty("pn")
        private Integer pn;
        @JsonProperty("ps")
        private Integer ps;
        @JsonProperty("total")
        private Integer total;

        public List<ListDTO> getList() {
            return list;
        }

        public void setList(List<ListDTO> list) {
            this.list = list;
        }

        public Integer getPn() {
            return pn;
        }

        public void setPn(Integer pn) {
            this.pn = pn;
        }

        public Integer getPs() {
            return ps;
        }

        public void setPs(Integer ps) {
            this.ps = ps;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public static class ListDTO {
            @JsonProperty("season_id")
            private Integer seasonId;
            @JsonProperty("media_id")
            private Integer mediaId;
            @JsonProperty("season_type")
            private Integer seasonType;
            @JsonProperty("season_type_name")
            private String seasonTypeName;
            @JsonProperty("title")
            private String title;
            @JsonProperty("cover")
            private String cover;
            @JsonProperty("total_count")
            private Integer totalCount;
            @JsonProperty("is_finish")
            private Integer isFinish;
            @JsonProperty("is_started")
            private Integer isStarted;
            @JsonProperty("is_play")
            private Integer isPlay;
            @JsonProperty("badge")
            private String badge;
            @JsonProperty("badge_type")
            private Integer badgeType;
            @JsonProperty("rights")
            private RightsDTO rights;
            @JsonProperty("stat")
            private StatDTO stat;
            @JsonProperty("new_ep")
            private NewEpDTO newEp;
            @JsonProperty("rating")
            private RatingDTO rating;
            @JsonProperty("square_cover")
            private String squareCover;
            @JsonProperty("season_status")
            private Integer seasonStatus;
            @JsonProperty("season_title")
            private String seasonTitle;
            @JsonProperty("badge_ep")
            private String badgeEp;
            @JsonProperty("media_attr")
            private Integer mediaAttr;
            @JsonProperty("season_attr")
            private Integer seasonAttr;
            @JsonProperty("evaluate")
            private String evaluate;
            @JsonProperty("areas")
            private List<AreasDTO> areas;
            @JsonProperty("subtitle")
            private String subtitle;
            @JsonProperty("first_ep")
            private Integer firstEp;
            @JsonProperty("can_watch")
            private Integer canWatch;
            @JsonProperty("series")
            private SeriesDTO series;
            @JsonProperty("publish")
            private PublishDTO publish;
            @JsonProperty("mode")
            private Integer mode;
            @JsonProperty("section")
            private List<SectionDTO> section;
            @JsonProperty("url")
            private String url;
            @JsonProperty("badge_info")
            private BadgeInfoDTO badgeInfo;
            @JsonProperty("renewal_time")
            private String renewalTime;
            @JsonProperty("first_ep_info")
            private FirstEpInfoDTO firstEpInfo;
            @JsonProperty("formal_ep_count")
            private Integer formalEpCount;
            @JsonProperty("short_url")
            private String shortUrl;
            @JsonProperty("follow_status")
            private Integer followStatus;
            @JsonProperty("is_new")
            private Integer isNew;
            @JsonProperty("progress")
            private String progress;
            @JsonProperty("both_follow")
            private Boolean bothFollow;


            public Integer getSeasonId() {
                return seasonId;
            }

            public void setSeasonId(Integer seasonId) {
                this.seasonId = seasonId;
            }

            public Integer getMediaId() {
                return mediaId;
            }

            public void setMediaId(Integer mediaId) {
                this.mediaId = mediaId;
            }

            public Integer getSeasonType() {
                return seasonType;
            }

            public void setSeasonType(Integer seasonType) {
                this.seasonType = seasonType;
            }

            public String getSeasonTypeName() {
                return seasonTypeName;
            }

            public void setSeasonTypeName(String seasonTypeName) {
                this.seasonTypeName = seasonTypeName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public Integer getTotalCount() {
                return totalCount;
            }

            public void setTotalCount(Integer totalCount) {
                this.totalCount = totalCount;
            }

            public Integer getIsFinish() {
                return isFinish;
            }

            public void setIsFinish(Integer isFinish) {
                this.isFinish = isFinish;
            }

            public Integer getIsStarted() {
                return isStarted;
            }

            public void setIsStarted(Integer isStarted) {
                this.isStarted = isStarted;
            }

            public Integer getIsPlay() {
                return isPlay;
            }

            public void setIsPlay(Integer isPlay) {
                this.isPlay = isPlay;
            }

            public String getBadge() {
                return badge;
            }

            public void setBadge(String badge) {
                this.badge = badge;
            }

            public Integer getBadgeType() {
                return badgeType;
            }

            public void setBadgeType(Integer badgeType) {
                this.badgeType = badgeType;
            }

            public RightsDTO getRights() {
                return rights;
            }

            public void setRights(RightsDTO rights) {
                this.rights = rights;
            }

            public StatDTO getStat() {
                return stat;
            }

            public void setStat(StatDTO stat) {
                this.stat = stat;
            }

            public NewEpDTO getNewEp() {
                return newEp;
            }

            public void setNewEp(NewEpDTO newEp) {
                this.newEp = newEp;
            }

            public RatingDTO getRating() {
                return rating;
            }

            public void setRating(RatingDTO rating) {
                this.rating = rating;
            }

            public String getSquareCover() {
                return squareCover;
            }

            public void setSquareCover(String squareCover) {
                this.squareCover = squareCover;
            }

            public Integer getSeasonStatus() {
                return seasonStatus;
            }

            public void setSeasonStatus(Integer seasonStatus) {
                this.seasonStatus = seasonStatus;
            }

            public String getSeasonTitle() {
                return seasonTitle;
            }

            public void setSeasonTitle(String seasonTitle) {
                this.seasonTitle = seasonTitle;
            }

            public String getBadgeEp() {
                return badgeEp;
            }

            public void setBadgeEp(String badgeEp) {
                this.badgeEp = badgeEp;
            }

            public Integer getMediaAttr() {
                return mediaAttr;
            }

            public void setMediaAttr(Integer mediaAttr) {
                this.mediaAttr = mediaAttr;
            }

            public Integer getSeasonAttr() {
                return seasonAttr;
            }

            public void setSeasonAttr(Integer seasonAttr) {
                this.seasonAttr = seasonAttr;
            }

            public String getEvaluate() {
                return evaluate;
            }

            public void setEvaluate(String evaluate) {
                this.evaluate = evaluate;
            }

            public List<AreasDTO> getAreas() {
                return areas;
            }

            public void setAreas(List<AreasDTO> areas) {
                this.areas = areas;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public Integer getFirstEp() {
                return firstEp;
            }

            public void setFirstEp(Integer firstEp) {
                this.firstEp = firstEp;
            }

            public Integer getCanWatch() {
                return canWatch;
            }

            public void setCanWatch(Integer canWatch) {
                this.canWatch = canWatch;
            }

            public SeriesDTO getSeries() {
                return series;
            }

            public void setSeries(SeriesDTO series) {
                this.series = series;
            }

            public PublishDTO getPublish() {
                return publish;
            }

            public void setPublish(PublishDTO publish) {
                this.publish = publish;
            }

            public Integer getMode() {
                return mode;
            }

            public void setMode(Integer mode) {
                this.mode = mode;
            }

            public List<SectionDTO> getSection() {
                return section;
            }

            public void setSection(List<SectionDTO> section) {
                this.section = section;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public BadgeInfoDTO getBadgeInfo() {
                return badgeInfo;
            }

            public void setBadgeInfo(BadgeInfoDTO badgeInfo) {
                this.badgeInfo = badgeInfo;
            }

            public String getRenewalTime() {
                return renewalTime;
            }

            public void setRenewalTime(String renewalTime) {
                this.renewalTime = renewalTime;
            }

            public FirstEpInfoDTO getFirstEpInfo() {
                return firstEpInfo;
            }

            public void setFirstEpInfo(FirstEpInfoDTO firstEpInfo) {
                this.firstEpInfo = firstEpInfo;
            }

            public Integer getFormalEpCount() {
                return formalEpCount;
            }

            public void setFormalEpCount(Integer formalEpCount) {
                this.formalEpCount = formalEpCount;
            }

            public String getShortUrl() {
                return shortUrl;
            }

            public void setShortUrl(String shortUrl) {
                this.shortUrl = shortUrl;
            }

            public Integer getFollowStatus() {
                return followStatus;
            }

            public void setFollowStatus(Integer followStatus) {
                this.followStatus = followStatus;
            }

            public Integer getIsNew() {
                return isNew;
            }

            public void setIsNew(Integer isNew) {
                this.isNew = isNew;
            }

            public String getProgress() {
                return progress;
            }

            public void setProgress(String progress) {
                this.progress = progress;
            }

            public Boolean getBothFollow() {
                return bothFollow;
            }

            public void setBothFollow(Boolean bothFollow) {
                this.bothFollow = bothFollow;
            }

            public static class RightsDTO {

                /**
                 * allow_review : 1
                 * is_selection : 1
                 * selection_style : 1
                 * demand_end_time : {}
                 * is_rcmd : 1
                 */

                @JsonProperty("allow_review")
                private Integer allowReview;
                @JsonProperty("is_selection")
                private Integer isSelection;
                @JsonProperty("selection_style")
                private Integer selectionStyle;
                @JsonProperty("demand_end_time")
                private DemandEndTimeDTO demandEndTime;
                @JsonProperty("is_rcmd")
                private Integer isRcmd;

                public Integer getAllowReview() {
                    return allowReview;
                }

                public void setAllowReview(Integer allowReview) {
                    this.allowReview = allowReview;
                }

                public Integer getIsSelection() {
                    return isSelection;
                }

                public void setIsSelection(Integer isSelection) {
                    this.isSelection = isSelection;
                }

                public Integer getSelectionStyle() {
                    return selectionStyle;
                }

                public void setSelectionStyle(Integer selectionStyle) {
                    this.selectionStyle = selectionStyle;
                }

                public DemandEndTimeDTO getDemandEndTime() {
                    return demandEndTime;
                }

                public void setDemandEndTime(DemandEndTimeDTO demandEndTime) {
                    this.demandEndTime = demandEndTime;
                }

                public Integer getIsRcmd() {
                    return isRcmd;
                }

                public void setIsRcmd(Integer isRcmd) {
                    this.isRcmd = isRcmd;
                }

                public static class DemandEndTimeDTO {

                }
            }


            public static class StatDTO {

                @JsonProperty("follow")
                private Integer follow;
                @JsonProperty("view")
                private Integer view;
                @JsonProperty("danmaku")
                private Integer danmaku;
                @JsonProperty("reply")
                private Integer reply;
                @JsonProperty("coin")
                private Integer coin;
                @JsonProperty("series_follow")
                private Integer seriesFollow;
                @JsonProperty("series_view")
                private Integer seriesView;
                @JsonProperty("likes")
                private Integer likes;

                public Integer getFollow() {
                    return follow;
                }

                public void setFollow(Integer follow) {
                    this.follow = follow;
                }

                public Integer getView() {
                    return view;
                }

                public void setView(Integer view) {
                    this.view = view;
                }

                public Integer getDanmaku() {
                    return danmaku;
                }

                public void setDanmaku(Integer danmaku) {
                    this.danmaku = danmaku;
                }

                public Integer getReply() {
                    return reply;
                }

                public void setReply(Integer reply) {
                    this.reply = reply;
                }

                public Integer getCoin() {
                    return coin;
                }

                public void setCoin(Integer coin) {
                    this.coin = coin;
                }

                public Integer getSeriesFollow() {
                    return seriesFollow;
                }

                public void setSeriesFollow(Integer seriesFollow) {
                    this.seriesFollow = seriesFollow;
                }

                public Integer getSeriesView() {
                    return seriesView;
                }

                public void setSeriesView(Integer seriesView) {
                    this.seriesView = seriesView;
                }

                public Integer getLikes() {
                    return likes;
                }

                public void setLikes(Integer likes) {
                    this.likes = likes;
                }
            }


            public static class NewEpDTO {

                @JsonProperty("id")
                private Integer id;
                @JsonProperty("index_show")
                private String indexShow;
                @JsonProperty("cover")
                private String cover;
                @JsonProperty("title")
                private String title;
                @JsonProperty("long_title")
                private String longTitle;
                @JsonProperty("pub_time")
                private String pubTime;
                @JsonProperty("duration")
                private Integer duration;

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public String getIndexShow() {
                    return indexShow;
                }

                public void setIndexShow(String indexShow) {
                    this.indexShow = indexShow;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getLongTitle() {
                    return longTitle;
                }

                public void setLongTitle(String longTitle) {
                    this.longTitle = longTitle;
                }

                public String getPubTime() {
                    return pubTime;
                }

                public void setPubTime(String pubTime) {
                    this.pubTime = pubTime;
                }

                public Integer getDuration() {
                    return duration;
                }

                public void setDuration(Integer duration) {
                    this.duration = duration;
                }
            }

            public static class RatingDTO {

                /**
                 * score : 9.8
                 * count : 11024
                 */

                @JsonProperty("score")
                private Double score;
                @JsonProperty("count")
                private Integer count;

                public Double getScore() {
                    return score;
                }

                public void setScore(Double score) {
                    this.score = score;
                }

                public Integer getCount() {
                    return count;
                }

                public void setCount(Integer count) {
                    this.count = count;
                }
            }

            public static class SeriesDTO {

                /**
                 * series_id : 3775
                 * title : 刺客伍六七
                 * season_count : 3
                 * new_season_id : 36594
                 * series_ord : 3
                 */

                @JsonProperty("series_id")
                private Integer seriesId;
                @JsonProperty("title")
                private String title;
                @JsonProperty("season_count")
                private Integer seasonCount;
                @JsonProperty("new_season_id")
                private Integer newSeasonId;
                @JsonProperty("series_ord")
                private Integer seriesOrd;

                public Integer getSeriesId() {
                    return seriesId;
                }

                public void setSeriesId(Integer seriesId) {
                    this.seriesId = seriesId;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public Integer getSeasonCount() {
                    return seasonCount;
                }

                public void setSeasonCount(Integer seasonCount) {
                    this.seasonCount = seasonCount;
                }

                public Integer getNewSeasonId() {
                    return newSeasonId;
                }

                public void setNewSeasonId(Integer newSeasonId) {
                    this.newSeasonId = newSeasonId;
                }

                public Integer getSeriesOrd() {
                    return seriesOrd;
                }

                public void setSeriesOrd(Integer seriesOrd) {
                    this.seriesOrd = seriesOrd;
                }
            }

            public static class PublishDTO {

                @JsonProperty("pub_time")
                private String pubTime;
                @JsonProperty("pub_time_show")
                private String pubTimeShow;
                @JsonProperty("release_date")
                private String releaseDate;
                @JsonProperty("release_date_show")
                private String releaseDateShow;

                public String getPubTime() {
                    return pubTime;
                }

                public void setPubTime(String pubTime) {
                    this.pubTime = pubTime;
                }

                public String getPubTimeShow() {
                    return pubTimeShow;
                }

                public void setPubTimeShow(String pubTimeShow) {
                    this.pubTimeShow = pubTimeShow;
                }

                public String getReleaseDate() {
                    return releaseDate;
                }

                public void setReleaseDate(String releaseDate) {
                    this.releaseDate = releaseDate;
                }

                public String getReleaseDateShow() {
                    return releaseDateShow;
                }

                public void setReleaseDateShow(String releaseDateShow) {
                    this.releaseDateShow = releaseDateShow;
                }
            }


            public static class BadgeInfoDTO {
                @JsonProperty("text")
                private String text;
                @JsonProperty("bg_color")
                private String bgColor;
                @JsonProperty("bg_color_night")
                private String bgColorNight;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getBgColor() {
                    return bgColor;
                }

                public void setBgColor(String bgColor) {
                    this.bgColor = bgColor;
                }

                public String getBgColorNight() {
                    return bgColorNight;
                }

                public void setBgColorNight(String bgColorNight) {
                    this.bgColorNight = bgColorNight;
                }
            }


            public static class FirstEpInfoDTO {

                @JsonProperty("id")
                private Integer id;
                @JsonProperty("cover")
                private String cover;
                @JsonProperty("title")
                private String title;
                @JsonProperty("long_title")
                private String longTitle;
                @JsonProperty("pub_time")
                private String pubTime;
                @JsonProperty("duration")
                private Integer duration;

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getLongTitle() {
                    return longTitle;
                }

                public void setLongTitle(String longTitle) {
                    this.longTitle = longTitle;
                }

                public String getPubTime() {
                    return pubTime;
                }

                public void setPubTime(String pubTime) {
                    this.pubTime = pubTime;
                }

                public Integer getDuration() {
                    return duration;
                }

                public void setDuration(Integer duration) {
                    this.duration = duration;
                }
            }

            public static class AreasDTO {

                /**
                 * id : 1
                 * name : 中国大陆
                 */

                @JsonProperty("id")
                private Integer id;
                @JsonProperty("name")
                private String name;

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class SectionDTO {

                @JsonProperty("section_id")
                private Integer sectionId;
                @JsonProperty("season_id")
                private Integer seasonId;
                @JsonProperty("limit_group")
                private Integer limitGroup;
                @JsonProperty("watch_platform")
                private Integer watchPlatform;
                @JsonProperty("copyright")
                private String copyright;
                @JsonProperty("ban_area_show")
                private Integer banAreaShow;
                @JsonProperty("episode_ids")
                private List<Integer> episodeIds;
                @JsonProperty("type")
                private Integer type;
                @JsonProperty("title")
                private String title;

                public Integer getSectionId() {
                    return sectionId;
                }

                public void setSectionId(Integer sectionId) {
                    this.sectionId = sectionId;
                }

                public Integer getSeasonId() {
                    return seasonId;
                }

                public void setSeasonId(Integer seasonId) {
                    this.seasonId = seasonId;
                }

                public Integer getLimitGroup() {
                    return limitGroup;
                }

                public void setLimitGroup(Integer limitGroup) {
                    this.limitGroup = limitGroup;
                }

                public Integer getWatchPlatform() {
                    return watchPlatform;
                }

                public void setWatchPlatform(Integer watchPlatform) {
                    this.watchPlatform = watchPlatform;
                }

                public String getCopyright() {
                    return copyright;
                }

                public void setCopyright(String copyright) {
                    this.copyright = copyright;
                }

                public Integer getBanAreaShow() {
                    return banAreaShow;
                }

                public void setBanAreaShow(Integer banAreaShow) {
                    this.banAreaShow = banAreaShow;
                }

                public List<Integer> getEpisodeIds() {
                    return episodeIds;
                }

                public void setEpisodeIds(List<Integer> episodeIds) {
                    this.episodeIds = episodeIds;
                }

                public Integer getType() {
                    return type;
                }

                public void setType(Integer type) {
                    this.type = type;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }
            }
        }
    }
}
