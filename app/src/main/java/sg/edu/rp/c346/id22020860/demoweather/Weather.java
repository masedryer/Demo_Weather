package sg.edu.rp.c346.id22020860.demoweather;

import androidx.annotation.NonNull;

public class Weather {

    private String area;
    private String forecast;


    public Weather(String area, String forecast) {
        this.area = area;
        this.forecast = forecast;
    }
    public String getArea() {
        return area;
    }

    public String getForecast() {
        return forecast;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    @NonNull
    @Override
    public String toString(){
        return "Area: " + area  + "\n" + "Forecast:" + forecast;
    }
}

