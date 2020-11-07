package com.dex.client;

public interface Client {

    public String sendGetRequest(String getUrl);

    public String sendPostRequest(String postUrl);

    public String sendPutRequest(String putUrl);

    public String sendDeleteRequest(String deleteUrl);
}
