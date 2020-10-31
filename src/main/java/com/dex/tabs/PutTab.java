package com.dex.tabs;

import javax.swing.*;
import java.awt.*;

public class PutTab extends JPanel {
    private JLabel filler = new JLabel("PUT");


    public PutTab() {
        filler.setHorizontalAlignment(JLabel.CENTER);
        this.setLayout(new GridLayout(1, 0));
        this.add(filler);
    }
}
