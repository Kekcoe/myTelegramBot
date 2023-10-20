package ru.kekcoe.feignweather.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kekcoe.feignweather.model.InformerResponse;

@FeignClient(name = "fiegnWeatherClient", url = "https://api.weather.yandex.ru/v2/",configuration = FeignWeatherClientConfig.class)
public interface FiegnWeatherClient {
    @GetMapping(value = "/informers")
    InformerResponse getInformers(@RequestParam("lat") double lat, @RequestParam("lon") double lon);
}
