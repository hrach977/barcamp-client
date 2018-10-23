package com.example.bar.dto;

import com.google.gson.annotations.SerializedName;

public class ScheduleElement {
    private int id;
    private LanguageDetail en;
    private LanguageDetail hy;
    @SerializedName("bg_image_url")
    private String bgImageUrl;
    @SerializedName("time_from")
    private TimeDetail from;
    @SerializedName("time_to")
    private TimeDetail to;
    private String room;

    public ScheduleElement() {}

    public ScheduleElement(int id, LanguageDetail en, LanguageDetail hy, String bgImageUrl, TimeDetail from, TimeDetail to, String room) {
        this.id = id;
        this.en = en;
        this.hy = hy;
        this.bgImageUrl = bgImageUrl;
        this.from = from;
        this.to = to;
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LanguageDetail getEn() {
        return en;
    }

    public void setEn(LanguageDetail en) {
        this.en = en;
    }

    public LanguageDetail getHy() {
        return hy;
    }

    public void setHy(LanguageDetail hy) {
        this.hy = hy;
    }

    public String getBgImageUrl() {
        return bgImageUrl;
    }

    public void setBgImageUrl(String bgImageUrl) {
        this.bgImageUrl = bgImageUrl;
    }

    public TimeDetail getFrom() {
        return from;
    }

    public void setFrom(TimeDetail from) {
        this.from = from;
    }

    public TimeDetail getTo() {
        return to;
    }

    public void setTo(TimeDetail to) {
        this.to = to;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        //String asd = (!getId().equals("null")) this.id : "No speaker specified";
        return this.id + " " + this.en.getSpeaker() + " " + this.en.getTopic();
    }
}
