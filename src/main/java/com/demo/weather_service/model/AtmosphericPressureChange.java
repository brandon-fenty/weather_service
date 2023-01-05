package com.demo.weather_service.model;

public class AtmosphericPressureChange {
    private CodeAndQuality tendency;
    private ValueAndQuality quantity3Hours;
    private ValueAndQuality quantity24Hours;

    public AtmosphericPressureChange(CodeAndQuality tendency, ValueAndQuality quantity3Hours, ValueAndQuality quantity24Hours) {
        this.tendency = tendency;
        this.quantity3Hours = quantity3Hours;
        this.quantity24Hours = quantity24Hours;
    }

    public CodeAndQuality getTendency() {
        return tendency;
    }

    public void setTendency(CodeAndQuality tendency) {
        this.tendency = tendency;
    }

    public ValueAndQuality getQuantity3Hours() {
        return quantity3Hours;
    }

    public void setQuantity3Hours(ValueAndQuality quantity3Hours) {
        this.quantity3Hours = quantity3Hours;
    }

    public ValueAndQuality getQuantity24Hours() {
        return quantity24Hours;
    }

    public void setQuantity24Hours(ValueAndQuality quantity24Hours) {
        this.quantity24Hours = quantity24Hours;
    }
}
