package com.dex.client;

import com.dex.util.Constants;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestClient implements Client {

    @Override
    public String sendGetRequest(String getUrl , String reqBody ) {
        String output = "";
        try {

            getUrl = "https://reqres.in/api/users?page=2";
            URL url = new URL(getUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod(Constants.GET_METHOD);
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            output = org.apache.commons.io.IOUtils.toString(br);
            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();

        }
        return output;
    }

    @Override
    public String sendPostRequest(String postUrl, String reqBody) {

        String output = "";
        try {

            URL obj = new URL(postUrl);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestMethod(Constants.POST_METHOD);
            conn.setRequestProperty("Content-type", "application/json");

            conn.setDoOutput(true);
            OutputStream os = conn.getOutputStream();
            os.write(reqBody.getBytes());
            os.flush();
            os.close();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            output = org.apache.commons.io.IOUtils.toString(br);
            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return output;
    }

    @Override
    public String sendPutRequest(String putUrl , String reqBody ) {
        String output = "";
        try {

            URL obj = new URL(putUrl);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestMethod(Constants.PUT_METHOD);
            conn.setRequestProperty("Content-type", "application/json");

            conn.setDoOutput(true);
            OutputStream os = conn.getOutputStream();
            os.write(reqBody.getBytes());
            os.flush();
            os.close();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            output = org.apache.commons.io.IOUtils.toString(br);
            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return output;
    }

    @Override
    public String sendDeleteRequest(String deleteUrl , String reqBody) {

        String output = "";
        try {

            URL obj = new URL(deleteUrl);
            HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
            conn.setRequestMethod(Constants.DELETE_METHOD);
            conn.setRequestProperty("Content-type", "application/json");

            conn.setDoOutput(true);
            OutputStream os = conn.getOutputStream();
            os.write(reqBody.getBytes());
            os.flush();
            os.close();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            output = org.apache.commons.io.IOUtils.toString(br);
            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return output;
    }
}
