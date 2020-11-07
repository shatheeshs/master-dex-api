package com.dex.tabs;

import com.dex.component.RequestPane;
import com.dex.component.ResponsePane;
import com.dex.util.Constants;

import javax.swing.*;
import java.awt.*;

public class GetTab extends JPanel {

    private final JLabel filler = new JLabel(Constants.GET_METHOD);
    private JTextField getUrlTextField = new JTextField();
    private ResponsePane responsePane = new ResponsePane();
    private RequestPane requestPane = new RequestPane();
    private JPanel operationPanel = new JPanel();


    public GetTab() {
        initGUI();
    }

    private void initGUI() {
        this.setLayout(new GridBagLayout());
//        filler.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
//        getUrlTextField.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
//        responsePane.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
//        requestPane.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
//        operationPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        this.add(filler, new GridBagConstraints(0, 0, 1, 1, 0.3, 1.0, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 0), 0, 0));
        this.add(getUrlTextField, new GridBagConstraints(1, 0, 1, 1, 10.0, 1.0, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(5, 0, 5, 5), 0, 0));

        operationPanel.add(requestPane, new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(5, 0, 0, 5), 0, 0));
        operationPanel.add(responsePane, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.NORTHEAST, GridBagConstraints.BOTH, new Insets(5, 0, 0, 5), 0, 0));
        this.add(operationPanel, new GridBagConstraints(0, 1, 2, 1, 1.0, 10.0, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(5, 0, 5, 0), 0, 0));
    }

    public JTextField getGetUrlTextField() {
        return getUrlTextField;
    }

    public ResponsePane getResponsePane() {
        return responsePane;
    }
}
