package com.dex.tabs;

import com.dex.component.RequestPane;
import com.dex.component.ResponsePane;
import com.dex.util.Constants;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractTab extends JPanel {

    private final JLabel filler = new JLabel();
    private JTextField urlTextField = new JTextField();
    private ResponsePane responsePane = new ResponsePane();
    private RequestPane requestPane = new RequestPane();
    private JPanel operationPanel = new JPanel();
    private JPanel labelPanel = new JPanel();
    private JLabel requestLabel = new JLabel(Constants.REQUEST_BODY);
    private JLabel responseLabel = new JLabel(Constants.RESPONSE_BODY);

    public AbstractTab(String tabLabel) {
        this.filler.setText(tabLabel);
        initGUI();
    }

    private void initGUI() {
        this.setLayout(new GridBagLayout());

        // CommonUtil.addBoarders(filler,urlTextField,responsePane,requestPane,operationPanel,requestLabel,responseLabel,labelPanel);

        this.add(filler, new GridBagConstraints(0, 0, 1, 1, 0.3, 1.0, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 0), 0, 0));
        this.add(urlTextField, new GridBagConstraints(1, 0, 1, 1, 10.0, 1.0, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(5, 0, 5, 5), 0, 0));

        labelPanel.setLayout(new GridBagLayout());
        labelPanel.add(requestLabel, new GridBagConstraints(0, 0, 1, 1, 1.05, 1.0, GridBagConstraints.SOUTHWEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 0, 5), 0, 0));
        labelPanel.add(responseLabel, new GridBagConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.SOUTHWEST, GridBagConstraints.HORIZONTAL, new Insets(5, 5, 0, 5), 0, 0));
        this.add(labelPanel, new GridBagConstraints(0, 1, 2, 1, 1.0, 1.0, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));

        operationPanel.add(requestPane, new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.SOUTHWEST, GridBagConstraints.BOTH, new Insets(5, 0, 0, 5), 0, 0));
        operationPanel.add(responsePane, new GridBagConstraints(1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.SOUTHWEST, GridBagConstraints.BOTH, new Insets(5, 0, 0, 5), 0, 0));
        this.add(operationPanel, new GridBagConstraints(0, 2, 2, 1, 1.0, 10.0, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
    }

    public JTextField getUrlTextField() {
        return urlTextField;
    }

    public ResponsePane getResponsePane() {
        return responsePane;
    }


}
