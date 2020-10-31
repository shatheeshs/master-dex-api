package com.dex.tabs;

import javax.swing.*;
import java.awt.*;

public class DeleteTab extends JPanel {

    private JLabel filler = new JLabel("DELETE");


    public DeleteTab() {
        filler.setHorizontalAlignment(JLabel.CENTER);
        this.setLayout(new GridLayout(1, 0));
        this.add(filler);
    }
}
