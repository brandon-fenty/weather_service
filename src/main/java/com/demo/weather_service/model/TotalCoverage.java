package com.demo.weather_service.model;

public class TotalCoverage {
    private String value;
    private String opaque;
    private String quality;

    public TotalCoverage(String value, String opaque, String quality) {
        this.value = value;
        this.opaque = opaque;
        this.quality = quality;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getOpaque() {
        return opaque;
    }

    public void setOpaque(String opaque) {
        this.opaque = opaque;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
