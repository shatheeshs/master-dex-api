package com.dex.component;

import com.dex.client.Client;
import com.dex.util.Constants;

import javax.swing.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DEXExecutor {

    private static final int BAR_MINIMUM = 0;
    private static final int BAR_MAXIMUM = 100;
    private JProgressBar pbar = new JProgressBar(BAR_MINIMUM, BAR_MAXIMUM);
    private Client client;
    private String requestBody;
    private String response;
    private int operation;
    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public DEXExecutor(Client client, String requestBody, int operation) {
        this.client = client;
        this.requestBody = requestBody;
        this.operation = operation;
    }

    public void startTask() {

        Future<String> result = executor.submit(new Callable<String>() {
            public String call() throws Exception {

                if (Constants.GET_TAB == operation) {
                    return client.sendGetRequest(requestBody);
                }
                if (Constants.POST_TAB == operation) {
                    return client.sendPostRequest(requestBody);
                }
                if (Constants.PUT_TAB == operation) {
                    return client.sendPutRequest(requestBody);
                }
                if (Constants.DELETE_TAB == operation) {
                    return client.sendDeleteRequest(requestBody);
                }
                return null;
            }
        });

        try {
            response = result.get();
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getResponse() {
        return response;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }
}
