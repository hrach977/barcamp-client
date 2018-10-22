package com.example.bar;

public class WorkShop {
    private String speaker;
    private String topic;

    public WorkShop() {

    }

    public WorkShop(String speaker, String topic) {
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
