package com.demo.weather_service.model;

public class Visibility {
    private ValueAndQuality distance;
    private ValueAndQuality variability;

    public Visibility(ValueAndQuality distance, ValueAndQuality variability) {
        this.distance = distance;
        this.variability = variability;
    }

    public ValueAndQuality getDistance() {
        return distance;
    }

    public void setDistance(ValueAndQuality distance) {
        this.distance = distance;
    }

    public ValueAndQuality getVariability() {
        return variability;
    }

    public void setVariability(ValueAndQuality variability) {
        this.variability = variability;
    }
}
