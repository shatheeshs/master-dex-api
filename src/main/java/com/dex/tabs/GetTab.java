package com.dex.tabs;

import javax.swing.*;
import java.awt.*;

public class GetTab extends JPanel {

    private final JLabel filler = new JLabel("GET");
    private JTextField getUrlTextField = new JTextField();


    public GetTab() {
        initGUI();
    }

    private void initGUI() {
        this.setLayout(new GridBagLayout());
        this.add(filler, new GridBagConstraints(0,1,1,1,0.5, 1.0 , GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL,  new Insets(5,5,5,0) , 0, 0));
        this.add(getUrlTextField,new GridBagConstraints(1,1,1,1,10.0, 1.0 , GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL,  new Insets(5,0,5,5) , 0, 0));
    }

    public JTextField getGetUrlTextField() {
        return getUrlTextField;
    }

    public void setGetUrlTextField(JTextField getUrlTextField) {
        this.getUrlTextField = getUrlTextField;
    }
}
