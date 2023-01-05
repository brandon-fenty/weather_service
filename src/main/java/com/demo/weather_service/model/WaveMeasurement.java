package com.demo.weather_service.model;

public class WaveMeasurement {
    private String method;
    private Wave waves;
    private CodeAndQuality seaState;

    public WaveMeasurement(String method, Wave waves, CodeAndQuality seaState) {
        this.method = method;
        this.waves = waves;
        this.seaState = seaState;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Wave getWaves() {
        return waves;
    }

    public void setWaves(Wave waves) {
        this.waves = waves;
    }

    public CodeAndQuality getSeaState() {
        return seaState;
    }

    public void setSeaState(CodeAndQuality seaState) {
        this.seaState = seaState;
    }
}
