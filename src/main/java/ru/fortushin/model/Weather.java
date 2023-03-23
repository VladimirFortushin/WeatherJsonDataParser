package ru.fortushin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonRootName(value = "weather")
public class Weather {
    @JsonProperty(value = "id")
    private int id;
    @JsonProperty(value = "main")
    private String main;
    @JsonProperty(value = "description")
    private String description;
    @JsonProperty(value = "icon")
    private String icon;
}
