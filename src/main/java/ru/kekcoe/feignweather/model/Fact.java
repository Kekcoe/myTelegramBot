package ru.kekcoe.feignweather.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    public long getObs_time() {
        return obs_time;
    }

    public void setObs_time(long obs_time) {
        this.obs_time = obs_time;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(int feels_like) {
        this.feels_like = feels_like;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(int wind_speed) {
        this.wind_speed = wind_speed;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public int getPressure_mm() {
        return pressure_mm;
    }

    public void setPressure_mm(int pressure_mm) {
        this.pressure_mm = pressure_mm;
    }

    public int getPressure_pa() {
        return pressure_pa;
    }

    public void setPressure_pa(int pressure_pa) {
        this.pressure_pa = pressure_pa;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getDaytime() {
        return daytime;
    }

    public void setDaytime(String daytime) {
        this.daytime = daytime;
    }

    public boolean isPolar() {
        return polar;
    }

    public void setPolar(boolean polar) {
        this.polar = polar;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getWind_gust() {
        return wind_gust;
    }

    public void setWind_gust(double wind_gust) {
        this.wind_gust = wind_gust;
    }

    @Override
    public String toString() {
        return "Температура = " + temp + "\n" +
                "ощущается как = " + feels_like + "\n" +
                "скорость ветра= " + wind_speed + "\n" +
                "направление ветра = " + wind_dir + "\n" +
                "Давление (в мм рт. ст.)= " + pressure_mm + "\n" +
                "влажность = " + humidity + "\n" +
                "Скорость порывов ветра (в м/с) = " + wind_gust + "\n" +
                '}';
    }
}