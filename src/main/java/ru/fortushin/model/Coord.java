package ru.fortushin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonRootName(value = "coord")
public class Coord {
    @JsonProperty(value = "lon")
    private double lon;
    @JsonProperty(value = "lat")
    private double lat;
}
