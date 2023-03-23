package ru.fortushin.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

import java.util.ArrayList;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherLocalData {
@JsonProperty("data")
    private Coord coord;
    @JsonProperty("weather")
    private ArrayList< Object > weather = new ArrayList<>();
    @JsonProperty("base")
    private String base;

    @JsonProperty("main")
    private Main main;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("wind")
    private Wind wind;
    @JsonProperty("clouds")
    private Clouds clouds;
    @JsonProperty("dt")
    private long dt;
    @JsonProperty("sys")
    private Sys sys;
    @JsonProperty("timezone")
    private int timezone;
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("cod")
    private int cod;

}
