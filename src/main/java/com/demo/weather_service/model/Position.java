package com.demo.weather_service.model;

import java.util.ArrayList;

public class Position {
    private String type;
    private ArrayList<Double> coordinates;

    public Position(String type, ArrayList<Double> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Double> coordinates) {
        this.coordinates = coordinates;
    }
}
