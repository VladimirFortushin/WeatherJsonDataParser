package ru.fortushin;

import ru.fortushin.model.ExternalData;
import ru.fortushin.util.JsonToPojo;
import ru.fortushin.util.PojoToJson;
import ru.fortushin.util.ReadZip;
import ru.fortushin.util.RequestBody;

import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        //Get all US state capitals zip codes from src/main/resources/zip.csv:
        Map<String, Integer> zipUs = ReadZip.getZipMap();
        for(var zip : zipUs.entrySet()){
            System.out.println(zip.getValue());
        }

        //Generate request to api.openweathermap.org API service
        //We can paste into request body additional parameters as well
        RequestBody requestBody = new RequestBody(zip, "");

        //Getting their full response in json
        String json = requestBody.getWeatherDataInJson();

         //Parsing json into our POJO
        ExternalData externalData = new ExternalData(JsonToPojo.getPojo(json));

        //We can parse our own POJO to json
        String ourDataJson = PojoToJson.getJson(externalData);

    }
}
