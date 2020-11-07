package com.dex.util;

import javax.swing.*;
import java.awt.*;

public class CommonUtil {

    public static void addBoarders(JComponent... args) {
        for (JComponent component : args) {
            component.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
    }
}
