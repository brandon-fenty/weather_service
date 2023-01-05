package com.demo.weather_service.model;

public class AngleAndQuality {
    private String angle;
    private String quality;

    public AngleAndQuality(String angle, String quality) {
        this.angle = angle;
        this.quality = quality;
    }

    public String getAngle() {
        return angle;
    }

    public void setAngle(String angle) {
        this.angle = angle;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
