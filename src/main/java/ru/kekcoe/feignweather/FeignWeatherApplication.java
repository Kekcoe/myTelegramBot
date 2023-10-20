package ru.kekcoe.feignweather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignWeatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignWeatherApplication.class, args);
    }

}
