package ru.fortushin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonRootName(value = "sys")
public class Sys {
    @JsonProperty(value = "type")
    private int type;
    @JsonProperty(value = "id")
    private long id;
    @JsonProperty(value = "country")
    private String country;
    @JsonProperty(value = "sunrise")
    private long sunrise;
    @JsonProperty(value = "sunset")
    private long sunset;
}
