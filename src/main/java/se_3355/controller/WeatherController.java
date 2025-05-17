package se_3355.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se_3355.entity.Weather;
import se_3355.repository.WeatherRepository;

import java.util.List;

@RestController
@RequestMapping("/api/weather")
@CrossOrigin(origins = "*")
public class WeatherController {
    @Autowired
    private WeatherRepository weatherRepository;

    @GetMapping
    public List<Weather> getWeatherData() {
        return weatherRepository.findAll();
    }
}
