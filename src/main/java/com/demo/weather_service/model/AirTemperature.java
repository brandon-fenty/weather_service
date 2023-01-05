package com.demo.weather_service.model;

public class AirTemperature {
    private String value;
    private String quality;

    public AirTemperature(String value, String quality) {
        this.value = value;
        this.quality = quality;
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
}
