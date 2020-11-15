package com.dex.component;

import com.dex.client.Client;
import com.dex.util.Constants;
import com.dex.util.DEXDataResponse;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DEXExecutor {

    private Client client;
    private String requestBody;
    private String url;
    private int operation;
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public DEXExecutor(Client client, int operation) {
        this.client = client;
        this.operation = operation;
    }

    public DEXDataResponse<String> startTask() {

        DEXDataResponse<String> response = new DEXDataResponse<>("Error", Constants.ERROR);
        try {
            Future<DEXDataResponse<String>> result = executor.submit(new Callable<DEXDataResponse<String>>() {
                public DEXDataResponse<String> call() throws Exception {

                    if (Constants.GET_TAB == operation) {
                        return client.sendGetRequest(url, requestBody);
                    }
                    if (Constants.POST_TAB == operation) {
                        return client.sendPostRequest(url, requestBody);
                    }
                    if (Constants.PUT_TAB == operation) {
                        return client.sendPutRequest(url, requestBody);
                    }
                    if (Constants.DELETE_TAB == operation) {
                        return client.sendDeleteRequest(url, requestBody);
                    }
                    return null;
                }
            });

            response = result.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
