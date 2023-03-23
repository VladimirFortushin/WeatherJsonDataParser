package ru.fortushin.util;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.fortushin.model.ExternalData;

public class PojoToJson {
    public static String getJson(ExternalData externalData) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(externalData);
    }
}
