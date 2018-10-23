package com.example.bar.dto;

public class LanguageDetail {
    private String speaker;
    private String topic;

    public LanguageDetail() {}

    public LanguageDetail(String speaker, String topic) {
        this.speaker = speaker;
        this.topic = topic;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
