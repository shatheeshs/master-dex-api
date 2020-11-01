package com.dex.component;

import com.dex.client.Client;
import com.dex.client.RestClient;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ProgressBar extends JDialog {

    private static final int BAR_MINIMUM = 0;
    private static final int BAR_MAXIMUM = 100;
    private JProgressBar pbar = new JProgressBar(BAR_MINIMUM, BAR_MAXIMUM);
    private Client client;
    private String requestBody;
    private String response;
    private ExecutorService executor = Executors.newSingleThreadExecutor();


    public ProgressBar(Object owner , Client client, String requestBody) {
        super((JFrame) owner, "Waiting", false);
        this.setLocationRelativeTo((JFrame)owner);
        this.client = client;
        this.requestBody = requestBody;
        initGUI();
    }

    public void startTask() {

        Future<String> result = executor.submit(new Callable<String>() {
            public String call() throws Exception {
                return ((RestClient) client).sendGetRequest(requestBody);
            }
        });

        try {
            response = result.get();
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initGUI() {
        this.setSize(new Dimension(100,100));
        this.setUndecorated(true);
        this.setVisible(false);
    }

    private ImageIcon initProgressImage() {
        ImageIcon icon = null;
        try {
            icon = new ImageIcon(new ImageIcon("F:\\Java\\masterdex\\src\\main\\resources\\wating.gif").getImage().getScaledInstance(100, 100, Image.SCALE_FAST));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return icon;
    }

    public void updateProgressBar(int newValue) {
        pbar.setValue(newValue);
    }

    public String getResponse() {
        return response;
    }


}
