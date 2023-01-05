package com.demo.weather_service.model;

public class PastWeatherObservationManual {
    private ValueAndQuality atmosphericCondition;
    private ValueAndQuality period;

    public PastWeatherObservationManual(ValueAndQuality atmosphericCondition, ValueAndQuality period) {
        this.atmosphericCondition = atmosphericCondition;
        this.period = period;
    }

    public ValueAndQuality getAtmosphericCondition() {
        return atmosphericCondition;
    }

    public void setAtmosphericCondition(ValueAndQuality atmosphericCondition) {
        this.atmosphericCondition = atmosphericCondition;
    }

    public ValueAndQuality getPeriod() {
        return period;
    }

    public void setPeriod(ValueAndQuality period) {
        this.period = period;
    }
}
