package com.dex.util;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class CommonUtil {

    public static void addBoarders(JComponent... args) {
        for (JComponent component : args) {
            component.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
    }

    public static boolean isUrlValid(String url) {
        try {
            URL obj = new URL(url);
            obj.toURI();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
