package com.dex.client;

import com.dex.util.DEXDataResponse;

public interface Client {

    public DEXDataResponse<String> sendGetRequest(String getUrl , String reqBody);

    public DEXDataResponse<String> sendPostRequest(String postUrl, String reqBody);

    public DEXDataResponse<String> sendPutRequest(String putUrl, String reqBody);

    public DEXDataResponse<String> sendDeleteRequest(String deleteUrl, String reqBody);
}
