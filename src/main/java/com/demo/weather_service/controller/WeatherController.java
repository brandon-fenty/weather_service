package com.demo.weather_service.controller;

import com.demo.weather_service.model.WeatherReport;
import com.demo.weather_service.persistence.WeatherDataRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class WeatherController {
    private final WeatherDataRepository weatherDataRepository;

    public WeatherController(WeatherDataRepository weatherDataRepository) {
        this.weatherDataRepository = weatherDataRepository;
    }

    @GetMapping("/callSign/{callLetters}")
    public List<WeatherReport> getReportsByCallLetters(@PathVariable String callLetters) {
        System.out.println(">>>>> getReportsByCallLetters: " + callLetters.toUpperCase());
        return  weatherDataRepository.findReportsByCallLetters(callLetters.toUpperCase());
    }

    @GetMapping("/coordinates/{x}/{y}")
    public List<WeatherReport> getReportsByCoordinates(@PathVariable Double x, @PathVariable Double y) {
        System.out.println(">>>>> getReportsByCallLetters: " + x + ", " + y);
        List<Double> coordinates = List.of(x, y);
        List<WeatherReport> reports = weatherDataRepository.findByPositionCoordinatesContaining(coordinates);

        return reports.stream()
                .filter(r -> r.getPosition().getCoordinates().containsAll(coordinates))
                .toList();
    }
}
