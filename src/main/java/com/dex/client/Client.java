package com.dex.client;

public interface Client {

    public String sendGetRequest(String getUrl , String reqBody);

    public String sendPostRequest(String postUrl, String reqBody);

    public String sendPutRequest(String putUrl, String reqBody);

    public String sendDeleteRequest(String deleteUrl, String reqBody);
}
