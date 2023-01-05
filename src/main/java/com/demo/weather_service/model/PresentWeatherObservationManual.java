package com.demo.weather_service.model;

public class PresentWeatherObservationManual {
    private String condition;
    private String quality;

    public PresentWeatherObservationManual(String condition, String quality) {
        this.condition = condition;
        this.quality = quality;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
