package ru.fortushin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonRootName(value = "main")
public class Main {
    @JsonProperty(value = "temp")
    private double temp;
    @JsonProperty(value = "feels_like")
    private double feels_like;
    @JsonProperty(value = "temp_min")
    private double temp_min;
    @JsonProperty(value = "temp_max")
    private double temp_max;
    @JsonProperty(value = "pressure")
    private int pressure;
    @JsonProperty(value = "humidity")
    private int humidity;
}
