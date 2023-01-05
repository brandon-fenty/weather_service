package com.demo.weather_service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document("data")
public class WeatherReport {
    @Id
    private String _id;
    private String st;
    private Date ts;
    private Position position;
    private int elevation;
    private String callLetters;
    private String qualityControlProcess;
    private String dataSource;
    private String type;
    private ValueAndQuality airTemperature;
    private ValueAndQuality dewPoint;
    private ValueAndQuality pressure;
    private Wind wind;
    private Visibility visibility;
    private SkyCondition skyCondition;
    private ArrayList<String> sections;
    private PrecipitationEstimatedObservation precipitationEstimatedObservation;
    private List<PastWeatherObservationManual> pastWeatherObservationManual;
    private SkyConditionObservation skyConditionObservation;
    private AtmosphericPressureChange atmosphericPressureChange;
    private List<PresentWeatherObservationManual> presentWeatherObservationManual;
    private ValueAndQuality seaSurfaceTemperature;
    private WaveMeasurement waveMeasurement;

    public WeatherReport(String _id, String st, Date ts, Position position, int elevation, String callLetters, String qualityControlProcess, String dataSource, String type, ValueAndQuality airTemperature, ValueAndQuality dewPoint, ValueAndQuality pressure, Wind wind, Visibility visibility, SkyCondition skyCondition, ArrayList<String> sections, PrecipitationEstimatedObservation precipitationEstimatedObservation, List<PastWeatherObservationManual> pastWeatherObservationManual, SkyConditionObservation skyConditionObservation, AtmosphericPressureChange atmosphericPressureChange, List<PresentWeatherObservationManual> presentWeatherObservationManual, ValueAndQuality seaSurfaceTemperature, WaveMeasurement waveMeasurement) {
        this._id = _id;
        this.st = st;
        this.ts = ts;
        this.position = position;
        this.elevation = elevation;
        this.callLetters = callLetters;
        this.qualityControlProcess = qualityControlProcess;
        this.dataSource = dataSource;
        this.type = type;
        this.airTemperature = airTemperature;
        this.dewPoint = dewPoint;
        this.pressure = pressure;
        this.wind = wind;
        this.visibility = visibility;
        this.skyCondition = skyCondition;
        this.sections = sections;
        this.precipitationEstimatedObservation = precipitationEstimatedObservation;
        this.pastWeatherObservationManual = pastWeatherObservationManual;
        this.skyConditionObservation = skyConditionObservation;
        this.atmosphericPressureChange = atmosphericPressureChange;
        this.presentWeatherObservationManual = presentWeatherObservationManual;
        this.seaSurfaceTemperature = seaSurfaceTemperature;
        this.waveMeasurement = waveMeasurement;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public String getCallLetters() {
        return callLetters;
    }

    public void setCallLetters(String callLetters) {
        this.callLetters = callLetters;
    }

    public String getQualityControlProcess() {
        return qualityControlProcess;
    }

    public void setQualityControlProcess(String qualityControlProcess) {
        this.qualityControlProcess = qualityControlProcess;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ValueAndQuality getAirTemperature() {
        return airTemperature;
    }

    public void setAirTemperature(ValueAndQuality airTemperature) {
        this.airTemperature = airTemperature;
    }

    public ValueAndQuality getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(ValueAndQuality dewPoint) {
        this.dewPoint = dewPoint;
    }

    public ValueAndQuality getPressure() {
        return pressure;
    }

    public void setPressure(ValueAndQuality pressure) {
        this.pressure = pressure;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public SkyCondition getSkyCondition() {
        return skyCondition;
    }

    public void setSkyCondition(SkyCondition skyCondition) {
        this.skyCondition = skyCondition;
    }

    public ArrayList<String> getSections() {
        return sections;
    }

    public void setSections(ArrayList<String> sections) {
        this.sections = sections;
    }

    public PrecipitationEstimatedObservation getPrecipitationEstimatedObservation() {
        return precipitationEstimatedObservation;
    }

    public void setPrecipitationEstimatedObservation(PrecipitationEstimatedObservation precipitationEstimatedObservation) {
        this.precipitationEstimatedObservation = precipitationEstimatedObservation;
    }

    public List<PastWeatherObservationManual> getPastWeatherObservationManual() {
        return pastWeatherObservationManual;
    }

    public void setPastWeatherObservationManual(List<PastWeatherObservationManual> pastWeatherObservationManual) {
        this.pastWeatherObservationManual = pastWeatherObservationManual;
    }

    public SkyConditionObservation getSkyConditionObservation() {
        return skyConditionObservation;
    }

    public void setSkyConditionObservation(SkyConditionObservation skyConditionObservation) {
        this.skyConditionObservation = skyConditionObservation;
    }

    public AtmosphericPressureChange getAtmosphericPressureChange() {
        return atmosphericPressureChange;
    }

    public void setAtmosphericPressureChange(AtmosphericPressureChange atmosphericPressureChange) {
        this.atmosphericPressureChange = atmosphericPressureChange;
    }

    public List<PresentWeatherObservationManual> getPresentWeatherObservationManual() {
        return presentWeatherObservationManual;
    }

    public void setPresentWeatherObservationManual(List<PresentWeatherObservationManual> presentWeatherObservationManual) {
        this.presentWeatherObservationManual = presentWeatherObservationManual;
    }

    public ValueAndQuality getSeaSurfaceTemperature() {
        return seaSurfaceTemperature;
    }

    public void setSeaSurfaceTemperature(ValueAndQuality seaSurfaceTemperature) {
        this.seaSurfaceTemperature = seaSurfaceTemperature;
    }

    public WaveMeasurement getWaveMeasurement() {
        return waveMeasurement;
    }

    public void setWaveMeasurement(WaveMeasurement waveMeasurement) {
        this.waveMeasurement = waveMeasurement;
    }
}
