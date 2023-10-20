package ru.kekcoe.feignweather.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fact {
    private long obs_time;
    private int temp;
    private int feels_like;
    private String icon;
    private String condition;
    private int wind_speed;
    private String wind_dir;
    private int pressure_mm;
    private int pressure_pa;
    private int humidity;
    private String daytime;
    private boolean polar;
    private String season;
    private double wind_gust;
}
