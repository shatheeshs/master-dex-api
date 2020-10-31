package com.dex.tabs;

import javax.swing.*;
import java.awt.*;

public class GetTab extends JPanel {

    private JLabel filler = new JLabel("GET");
    private JTextField getTextField = new JTextField();


    public GetTab() {
        initGUI();
    }

    private void initGUI() {

        filler.setHorizontalAlignment(JLabel.CENTER);
        this.setLayout(new GridLayout(2, 2));
        this.add(filler, new GridLayout(1,0));
        this.add(getTextField, new GridLayout(1,1));
        this.add(filler);
    }
}
