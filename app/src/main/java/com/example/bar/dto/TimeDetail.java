package com.example.bar.dto;

import com.google.gson.annotations.SerializedName;

public class TimeDetail {
    private String date;
    @SerializedName("timezone_type")
    private int timezoneType;
    private String timezone;

    public TimeDetail() {}

    public TimeDetail(String date, int timezoneType, String timezone) {
        this.date = date;
        this.timezone = timezone;
        this.timezoneType = timezoneType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTimezoneType() {
        return timezoneType;
    }

    public void setTimezoneType(int timezoneType) {
        this.timezoneType = timezoneType;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
