package com.demo.weather_service.persistence;

import com.demo.weather_service.model.WeatherReport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface WeatherDataRepository extends MongoRepository<WeatherReport, String> {
    @Query("{callLetters:'?0'}")
    List<WeatherReport> findReportsByCallLetters(String callLetters);

    List<WeatherReport> findByPositionCoordinatesContaining(List<Double> coordinates);

}
