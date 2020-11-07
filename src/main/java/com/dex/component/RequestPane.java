package com.dex.component;

import javax.swing.*;
import java.awt.*;

public class RequestPane extends JPanel {

    private JTextArea requestTextArea = new JTextArea();
    private JScrollPane requestScroll = new JScrollPane(requestTextArea);


    public RequestPane() {

        initGUI();
    }

    private void initGUI() {
        requestScroll.setPreferredSize(new Dimension(500, 400));
        requestScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        requestScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(requestScroll);
    }

    public JTextArea getRequestTextArea() {
        return requestTextArea;
    }

}
