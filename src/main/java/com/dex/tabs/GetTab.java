package com.dex.tabs;

import com.dex.component.ResponsePane;

import javax.swing.*;
import java.awt.*;

public class GetTab extends JPanel {

    private final JLabel filler = new JLabel("GET");
    private JTextField getUrlTextField = new JTextField();
    private ResponsePane responsePane = new ResponsePane();


    public GetTab() {
        initGUI();
    }

    private void initGUI() {
        this.setLayout(new GridBagLayout());
        filler.setBorder(BorderFactory. createLineBorder(Color. BLUE, 1));
        getUrlTextField.setBorder(BorderFactory. createLineBorder(Color. BLUE, 1));
        responsePane.setBorder(BorderFactory. createLineBorder(Color. BLUE, 1));
        this.add(filler, new GridBagConstraints(0,0,1,1,0.5, 1.0 , GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL,  new Insets(5,5,5,0) , 0, 0));
        this.add(getUrlTextField,new GridBagConstraints(1,0,1,1,10.0, 1.0 , GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL,  new Insets(5,0,5,5) , 0, 0));
        this.add(responsePane,new GridBagConstraints(1,1,1,1,1.0, 1.0 , GridBagConstraints.NORTHEAST, GridBagConstraints.BOTH,  new Insets(5,0,5,5) , 0, 0));
    }

    public JTextField getGetUrlTextField() {
        return getUrlTextField;
    }

    public ResponsePane getResponsePane() {
        return responsePane;
    }
}
