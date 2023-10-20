package ru.kekcoe.feignweather.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Part {

    private String part_name;
    private int temp_min;
    private int temp_avg;
    private int temp_max;
    private double wind_speed;
    private double wind_gust;
    private String wind_dir;
    private int pressure_mm;
    private int pressure_pa;
    private int humidity;
    private double prec_mm;
    private int prec_prob;
    private int prec_period;
    private String icon;
    private String condition;
    private int feels_like;
    private String daytime;
    private boolean polar;

}
