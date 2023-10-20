package ru.kekcoe.feignweather.dao;

import ru.kekcoe.feignweather.model.InformerResponse;

public interface WeatherDao {
 InformerResponse getInformerResponse(double lat, double lon);
}
