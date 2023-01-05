package com.demo.weather_service.model;

public class Wave {
    private int period;
    private Double height;
    private String quality;

    public Wave(int period, Double height, String quality) {
        this.period = period;
        this.height = height;
        this.quality = quality;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
