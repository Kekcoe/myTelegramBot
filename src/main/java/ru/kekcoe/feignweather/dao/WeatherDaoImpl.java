package ru.kekcoe.feignweather.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kekcoe.feignweather.client.FiegnWeatherClient;
import ru.kekcoe.feignweather.model.InformerResponse;

@Service
@RequiredArgsConstructor
public class WeatherDaoImpl implements WeatherDao {
    private final FiegnWeatherClient feignWeatherClient;
    @Override
    public InformerResponse getInformerResponse(double lat, double lon) {
        return feignWeatherClient.getInformers(lat,lon);
    }

    @Override
    public InformerResponse getInformerResponse(String locationName) {
        if(locationName.equals("Дом")){
            return feignWeatherClient.getInformers(59.838937, 30.104297);
        }
        return feignWeatherClient.getInformers(59.833909, 30.220943);
    }
}
