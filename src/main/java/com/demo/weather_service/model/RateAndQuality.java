package com.demo.weather_service.model;

public class RateAndQuality {
    private String rate;
    private String quality;

    public RateAndQuality(String rate, String quality) {
        this.rate = rate;
        this.quality = quality;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
