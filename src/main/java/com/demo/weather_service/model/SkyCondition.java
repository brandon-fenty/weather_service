package com.demo.weather_service.model;

public class SkyCondition {
    private CeilingHeight ceilingHeight;
    private String cavok;

    public SkyCondition(CeilingHeight ceilingHeight, String cavok) {
        this.ceilingHeight = ceilingHeight;
        this.cavok = cavok;
    }

    public CeilingHeight getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(CeilingHeight ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    public String getCavok() {
        return cavok;
    }

    public void setCavok(String cavok) {
        this.cavok = cavok;
    }
}
