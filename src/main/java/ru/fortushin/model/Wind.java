package ru.fortushin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonRootName(value = "wind")
public class Wind {
    @JsonProperty(value = "speed")
    private double speed;
    @JsonProperty(value = "deg")
    private int deg;
}
