package com.demo.weather_service.model;

public class CeilingHeight {
    private String value;
    private String quality;
    private String determination;

    public CeilingHeight(String value, String quality, String determination) {
        this.value = value;
        this.quality = quality;
        this.determination = determination;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getDetermination() {
        return determination;
    }

    public void setDetermination(String determination) {
        this.determination = determination;
    }
}
