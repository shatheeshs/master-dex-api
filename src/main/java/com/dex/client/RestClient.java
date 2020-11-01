package com.dex.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestClient implements Client {


    public String sendGetRequest(String getUrl) {
        String output = "";
        try {

            getUrl = "https://api.openweathermap.org/data/2.5/weather?q=London&appid=49f9a2328bc0c24707cb2d8fc4eb88ef";
            URL url = new URL(getUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            output = org.apache.commons.io.IOUtils.toString(br);
            System.out.println("Output from Server .... \n");
            conn.disconnect();

        } catch (Exception e) {

            e.printStackTrace();

        }
        return output;
    }

}
