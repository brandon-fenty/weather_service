package com.demo.weather_service.model;

public class PrecipitationEstimatedObservation {
    private String discrepancy;
    private String estimatedWaterDepth;

    public PrecipitationEstimatedObservation(String discrepancy, String estimatedWaterDepth) {
        this.discrepancy = discrepancy;
        this.estimatedWaterDepth = estimatedWaterDepth;
    }

    public String getDiscrepancy() {
        return discrepancy;
    }

    public void setDiscrepancy(String discrepancy) {
        this.discrepancy = discrepancy;
    }

    public String getEstimatedWaterDepth() {
        return estimatedWaterDepth;
    }

    public void setEstimatedWaterDepth(String estimatedWaterDepth) {
        this.estimatedWaterDepth = estimatedWaterDepth;
    }
}
