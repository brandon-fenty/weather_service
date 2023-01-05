package com.demo.weather_service.model;

public class Wind {
    private AngleAndQuality direction;
    private String type;
    private RateAndQuality speed;

    public Wind(AngleAndQuality direction, String type, RateAndQuality speed) {
        this.direction = direction;
        this.type = type;
        this.speed = speed;
    }

    public AngleAndQuality getDirection() {
        return direction;
    }

    public void setDirection(AngleAndQuality direction) {
        this.direction = direction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RateAndQuality getSpeed() {
        return speed;
    }

    public void setSpeed(RateAndQuality speed) {
        this.speed = speed;
    }
}
