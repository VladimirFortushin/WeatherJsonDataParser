package ru.fortushin.util;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@AllArgsConstructor
@NoArgsConstructor
public class RequestBody {
    private int requiredZip;
    private String requiredApiKey;
    private String apiUrl = "https://api.openweathermap.org/data/2.5/weather";
    private String optionalMode;
    private String optionalUnits;
    private String optionalLang;
    private URL url;
    private HttpURLConnection connection;

    public RequestBody(int requiredZip, String requiredAppid) {
        this.requiredZip = requiredZip;
        this.requiredApiKey = requiredAppid;
    }

    public String getWeatherDataInJson() throws IOException {
        String query = String.format("zip=%s&units=metric&appid=%s",
                URLEncoder.encode(String.valueOf(requiredZip), StandardCharsets.UTF_8),
                URLEncoder.encode(requiredApiKey, StandardCharsets.UTF_8));
        url = new URL(apiUrl + "?" + query);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int responseCode = connection.getResponseCode();
        StringBuilder responseBody  = new StringBuilder();;
        if(responseCode == 200){
            InputStream inputStream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = reader.readLine()) != null) {
                responseBody.append(line);
            }
            reader.close();
        }

        return String.valueOf(responseBody);
    }


}
