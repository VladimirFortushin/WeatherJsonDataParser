package ru.fortushin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExternalData {
@JsonProperty("name")
    private String name;
    @JsonProperty("country")
    private String country;
    @JsonProperty("cod")
    private int responseCode;
    @JsonProperty("temp")
    private double temp;
    @JsonProperty("pressure")
    private int pressure;
    @JsonProperty("humidity")
    private int humidity;

    public ExternalData(WeatherLocalData weatherLocalData){
        this.name = weatherLocalData.getName();
        this.country = weatherLocalData.getSys().getCountry();
        this.responseCode = weatherLocalData.getCod();
        this.temp = weatherLocalData.getMain().getTemp();
        this.pressure = weatherLocalData.getMain().getPressure();
        this.humidity = weatherLocalData.getMain().getHumidity();
    }


}
