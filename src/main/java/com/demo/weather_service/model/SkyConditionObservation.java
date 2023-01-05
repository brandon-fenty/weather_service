package com.demo.weather_service.model;

public class SkyConditionObservation {
    private TotalCoverage totalCoverage;
    private ValueAndQuality lowestCloudCoverage;
    private ValueAndQuality lowCloudGenus;
    private ValueAndQuality lowestCloudBaseHeight;
    private ValueAndQuality midCloudGenus;
    private ValueAndQuality highCloudGenus;

    public SkyConditionObservation(TotalCoverage totalCoverage, ValueAndQuality lowestCloudCoverage, ValueAndQuality lowCloudGenus, ValueAndQuality lowestCloudBaseHeight, ValueAndQuality midCloudGenus, ValueAndQuality highCloudGenus) {
        this.totalCoverage = totalCoverage;
        this.lowestCloudCoverage = lowestCloudCoverage;
        this.lowCloudGenus = lowCloudGenus;
        this.lowestCloudBaseHeight = lowestCloudBaseHeight;
        this.midCloudGenus = midCloudGenus;
        this.highCloudGenus = highCloudGenus;
    }

    public TotalCoverage getTotalCoverage() {
        return totalCoverage;
    }

    public void setTotalCoverage(TotalCoverage totalCoverage) {
        this.totalCoverage = totalCoverage;
    }

    public ValueAndQuality getLowestCloudCoverage() {
        return lowestCloudCoverage;
    }

    public void setLowestCloudCoverage(ValueAndQuality lowestCloudCoverage) {
        this.lowestCloudCoverage = lowestCloudCoverage;
    }

    public ValueAndQuality getLowCloudGenus() {
        return lowCloudGenus;
    }

    public void setLowCloudGenus(ValueAndQuality lowCloudGenus) {
        this.lowCloudGenus = lowCloudGenus;
    }

    public ValueAndQuality getLowestCloudBaseHeight() {
        return lowestCloudBaseHeight;
    }

    public void setLowestCloudBaseHeight(ValueAndQuality lowestCloudBaseHeight) {
        this.lowestCloudBaseHeight = lowestCloudBaseHeight;
    }

    public ValueAndQuality getMidCloudGenus() {
        return midCloudGenus;
    }

    public void setMidCloudGenus(ValueAndQuality midCloudGenus) {
        this.midCloudGenus = midCloudGenus;
    }

    public ValueAndQuality getHighCloudGenus() {
        return highCloudGenus;
    }

    public void setHighCloudGenus(ValueAndQuality highCloudGenus) {
        this.highCloudGenus = highCloudGenus;
    }
}
