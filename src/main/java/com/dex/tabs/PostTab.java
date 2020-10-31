package com.dex.tabs;

import javax.swing.*;
import java.awt.*;

public class PostTab extends JPanel{

    private JLabel filler = new JLabel("POST");


    public PostTab() {
        filler.setHorizontalAlignment(JLabel.CENTER);
        this.setLayout(new GridLayout(1, 0));
        this.add(filler);
    }
}
