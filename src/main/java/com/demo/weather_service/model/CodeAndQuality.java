package com.demo.weather_service.model;

public class CodeAndQuality {
    private String code;
    private String quality;

    public CodeAndQuality(String code, String quality) {
        this.code = code;
        this.quality = quality;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
