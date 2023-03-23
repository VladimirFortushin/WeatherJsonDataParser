package ru.fortushin.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.fortushin.model.WeatherLocalData;

public class JsonToPojo {
    public static WeatherLocalData getPojo(String json){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        WeatherLocalData data = null;
        try {
            data = objectMapper.readValue(json, WeatherLocalData.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
