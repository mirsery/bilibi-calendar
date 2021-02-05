package com.mirsery.bilibili.service;

import com.mirsery.bilibili.dto.FollowDto.DataDTO.ListDTO;
import com.mirsery.bilibili.dto.SurviveDto.ResultDTO;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.mail.internet.AddressException;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.DateTime;
import net.fortuna.ical4j.model.Dur;
import net.fortuna.ical4j.model.Property;
import net.fortuna.ical4j.model.PropertyList;
import net.fortuna.ical4j.model.Time;
import net.fortuna.ical4j.model.TimeZone;
import net.fortuna.ical4j.model.TimeZoneRegistry;
import net.fortuna.ical4j.model.TimeZoneRegistryFactory;
import net.fortuna.ical4j.model.component.CalendarComponent;
import net.fortuna.ical4j.model.component.VAlarm;
import net.fortuna.ical4j.model.component.VEvent;
import net.fortuna.ical4j.model.parameter.Cn;
import net.fortuna.ical4j.model.parameter.CuType;
import net.fortuna.ical4j.model.parameter.Display;
import net.fortuna.ical4j.model.parameter.Email;
import net.fortuna.ical4j.model.parameter.FmtType;
import net.fortuna.ical4j.model.parameter.PartStat;
import net.fortuna.ical4j.model.parameter.Role;
import net.fortuna.ical4j.model.parameter.Value;
import net.fortuna.ical4j.model.property.Action;
import net.fortuna.ical4j.model.property.Description;
import net.fortuna.ical4j.model.property.DtEnd;
import net.fortuna.ical4j.model.property.DtStamp;
import net.fortuna.ical4j.model.property.DtStart;
import net.fortuna.ical4j.model.property.Duration;
import net.fortuna.ical4j.model.property.Image;
import net.fortuna.ical4j.model.property.Location;
import net.fortuna.ical4j.model.property.Method;
import net.fortuna.ical4j.model.property.Name;
import net.fortuna.ical4j.model.property.ProdId;
import net.fortuna.ical4j.model.property.RefreshInterval;
import net.fortuna.ical4j.model.property.Repeat;
import net.fortuna.ical4j.model.property.Sequence;
import net.fortuna.ical4j.model.property.Summary;
import net.fortuna.ical4j.model.property.Uid;
import net.fortuna.ical4j.model.property.Url;
import net.fortuna.ical4j.model.property.Version;
import net.fortuna.ical4j.model.property.XProperty;
import org.springframework.stereotype.Service;

/**
 * @program: bilibi-calendar
 * @description: 日历订阅服务
 * @author: misery
 * @create: 2021-02-04 11:29
 **/
@Service
public class CalendarService {

    public Calendar generateCalendar() throws ParseException, IOException, URISyntaxException {

/*
        VERSION:2.0
        PRODID:-//hi94740//bilibili-bangumi-calendar//ZH
        URL:https://calendars.hi94740.workers.dev/bilibili/bangumi.ics?uid=22370906
        METHOD:PUBLISH
        NAME:bilibili追番
        X-WR-CALNAME:bilibili追番
        TIMEZONE-ID:Asia/Shanghai
        X-WR-TIMEZONE:Asia/Shanghai
        REFRESH-INTERVAL;VALUE=DURATION:PT12H
        X-PUBLISHED-TTL:PT12H
* */
        Calendar calendar = new Calendar();
        PropertyList<Property> propertyList = calendar.getProperties();
        Version version = new Version();
        version.setValue(Version.VERSION_2_0.getValue());
        ProdId prodId = new ProdId();
        prodId.setValue("mirsery/bilibili-calendar");
        Url url = new Url();
        url.setValue("https://mirsery.com");
        Method method = new Method();
        method.setValue(Method.PUBLISH.getValue());
        Name name = new Name();
        name.setValue("bilibili追番");
        XProperty CALNAME = new XProperty("X-WR-CALNAME", "bilibili追番");
        XProperty TIMEZONE = new XProperty("TIMEZONE-ID", "Asia/Shanghai");
        RefreshInterval refreshInterval = new RefreshInterval();
        refreshInterval.setValue("PT12H");
        XProperty PUBLISHED = new XProperty("X-PUBLISHED-TTL", "PT12H");
        XProperty XTIMEZONE = new XProperty("X-WR-TIMEZONE", "Asia/Shanghai");
        propertyList.add(version);
        propertyList.add(prodId);
        propertyList.add(url);
        propertyList.add(method);
        propertyList.add(name);
        propertyList.add(CALNAME);
        propertyList.add(TIMEZONE);
        propertyList.add(refreshInterval);
        propertyList.add(XTIMEZONE);
        propertyList.add(PUBLISHED);
        return calendar;
    }

    public List<CalendarComponent> generateCalendarComponent(List<ResultDTO> list,
            HashMap<Integer, ListDTO> seasonsFollow) {

        TimeZoneRegistry registry = TimeZoneRegistryFactory.getInstance().createRegistry();
        TimeZone timezone = registry.getTimeZone("Asia/Shanghai");

        List<CalendarComponent> components = new ArrayList<>();

        list.forEach(dayItem -> dayItem.getSeasons().forEach(
                seasonsDTO -> {
                    VEvent vEvent = new VEvent();
                    Uid uid = new Uid();
                    uid.setValue("bilibili-" + seasonsDTO.getSeasonId() + "-" + seasonsDTO.getEpId());
                    Sequence sequence = new Sequence();
                    sequence.setValue("0");
                    DtStamp dtStamp = new DtStamp();
                    dtStamp.setDate(new DateTime());

                    DtStart dtStart = new DtStart();
                    dtStart.setDate(new DateTime((long) seasonsDTO.getPubTs() * 1000));
                    dtStart.setTimeZone(timezone);

                    DtEnd dtEnd = new DtEnd();
                    dtEnd.setDate(new DateTime((long) seasonsDTO.getPubTs() * 1000 + (long) 30 * 60 * 1000));
                    dtEnd.setTimeZone(timezone);

                    Summary summary = new Summary();
                    summary.setValue("《" + seasonsDTO.getTitle() + "》" + " 更新");

                    Location location = new Location();
                    location.setValue(seasonsDTO.getPubIndex());

                    Description description = new Description();
                    description.setValue(seasonsFollow.get(seasonsDTO.getSeasonId()).getEvaluate());

                    Display display = new Display("BADGE,THUMBNAIL");
                    FmtType fmtType = new FmtType("image/png:" + seasonsDTO.getSquareCover());
                    Image image = new Image();
                    image.setValue(seasonsDTO.getSquareCover());
                    image.getParameters().add(display);
                    image.getParameters().add(fmtType);

                    XProperty ATTENDEE = new XProperty("ATTENDEE");
                    Role role = new Role("CHAIR");
                    CuType cuType = new CuType("INDIVIDUAL");
                    PartStat partStat = new PartStat("ACCEPTED");
                    Cn cn = new Cn("bilibili追番日历 by mirsery");

                    Email mailto = null;
                    try {
                        mailto = new Email("mirsery@163.com");
                    } catch (AddressException e) {
                        e.printStackTrace();
                    }

                    VAlarm valarm = new VAlarm(new DateTime((long) seasonsDTO.getPubTs() * 1000));
                    valarm.getProperties().add(summary);
                    valarm.getProperties().add(Action.DISPLAY);
                    valarm.getProperties().add(description);
                    vEvent.getAlarms().add(valarm);

                    ATTENDEE.getParameters().add(role);
                    ATTENDEE.getParameters().add(cuType);
                    ATTENDEE.getParameters().add(partStat);
                    ATTENDEE.getParameters().add(cn);
                    ATTENDEE.getParameters().add(mailto);

                    Url url = new Url();
                    url.getParameters().add(Value.URI);
                    try {
                        url.setValue(seasonsDTO.getUrl());
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }

                    PropertyList<Property> properties = vEvent.getProperties();
                    properties.add(uid);
                    properties.add(sequence);
                    properties.add(dtStart);
                    properties.add(dtEnd);
                    properties.add(summary);
                    properties.add(location);
                    properties.add(description);
                    properties.add(image);
                    properties.add(ATTENDEE);
                    properties.add(url);
                    components.add(vEvent);
                }
        ));

        return components;
    }
}