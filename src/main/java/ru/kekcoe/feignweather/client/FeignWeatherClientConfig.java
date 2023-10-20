package ru.kekcoe.feignweather.client;

import feign.Headers;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignWeatherClientConfig {
    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("X-Yandex-API-Key", "91c42247-6653-415a-868b-59afc400dfda");
        };
    }
}