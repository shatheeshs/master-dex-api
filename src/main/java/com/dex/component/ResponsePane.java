package com.dex.component;

import javax.swing.*;
import java.awt.*;

public class ResponsePane extends JPanel {

    private JTextArea responseTextArea = new JTextArea();
    private JScrollPane responseScroll = new JScrollPane(responseTextArea);

    public ResponsePane() {

        initGUI();
    }

    private void initGUI() {
        responseScroll.setPreferredSize(new Dimension(500, 400));
        responseScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        responseScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(responseScroll);
    }

    public JTextArea getResponseTextArea() {
        return responseTextArea;
    }

    public void setResponseColour(Color colour) {
        responseTextArea.setForeground(colour);
    }

}
