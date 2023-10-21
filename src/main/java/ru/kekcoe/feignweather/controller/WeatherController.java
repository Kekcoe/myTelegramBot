package ru.kekcoe.feignweather.controller;

import feign.Headers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.kekcoe.feignweather.dao.WeatherDao;
import ru.kekcoe.feignweather.model.InformerResponse;

@RestController
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherDao weatherDao;

    @GetMapping("/weather")
    public InformerResponse getWeather(@RequestParam("locationname") String locationName) {
        return weatherDao.getInformerResponse(locationName);
    }

}