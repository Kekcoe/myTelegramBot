package ru.kekcoe.feignweather.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InformerResponse {
    private long now;
    private String now_dt;
    private Info info;
    private Fact fact;
    private Forecast forecast;
}
