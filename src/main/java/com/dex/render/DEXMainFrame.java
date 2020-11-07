package com.dex.render;

import com.dex.client.RestClient;
import com.dex.component.DEXExecutor;
import com.dex.tabs.AbstractTab;
import com.dex.util.Constants;
import com.dex.util.JsonUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import static javax.swing.JOptionPane.DEFAULT_OPTION;

public class DEXMainFrame extends JFrame implements ActionListener, WindowListener {


    private static DEXMainFrame DEXMainFrameInstance;
    private DEXTabPanel dexTabPanel = new DEXTabPanel();
    private JPanel mainButtonPanel = new JPanel();
    private JButton executeButton = new JButton("Execute");
    private JButton resetButton = new JButton("Reset");
    private RestClient restClient;
    private DEXExecutor dexExecutor;


    private DEXMainFrame() {
        initGUI();
        restClient = new RestClient();
        dexExecutor = new DEXExecutor(restClient, "", 0);
    }

    public static synchronized DEXMainFrame getInstance() {
        if (DEXMainFrameInstance == null) {
            DEXMainFrameInstance = new DEXMainFrame();
        }
        return DEXMainFrameInstance;
    }

    private void initGUI() {

        //LookAndFeel
        setDefaultLookAndFeelDecorated(true);
        this.setTitle("MasterDEX");
        this.setSize(1000, 600);

        //Set Main Icon
        ImageIcon img = new ImageIcon("F:\\Java\\masterdex\\src\\main\\resources\\mdex.GIF");
        this.setIconImage(img.getImage());

        //Layout Definitions
        this.setLayout(new GridBagLayout());
        mainButtonPanel.setLayout(new GridBagLayout());

        //Add Main Panels
        this.add(dexTabPanel, new GridBagConstraints(1, 0, 1, 1, 1, 10, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
        mainButtonPanel.add(resetButton, new GridBagConstraints(0, 0, 1, 1, 10, 1, GridBagConstraints.EAST, GridBagConstraints.VERTICAL, new Insets(0, 0, 0, 0), 50, 0));
        mainButtonPanel.add(executeButton, new GridBagConstraints(1, 0, 1, 1, 0.2, 1, GridBagConstraints.EAST, GridBagConstraints.VERTICAL, new Insets(0, 0, 0, 5), 40, 0));
        this.add(mainButtonPanel, new GridBagConstraints(1, 1, 1, 1, 1, 0.1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));

        //Add Listeners
        this.addWindowListener(this);
        resetButton.addActionListener(this);
        executeButton.addActionListener(this);

        this.setResizable(false);

        pack();
        //Display the window.
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resetButton) {
            ((AbstractTab) dexTabPanel.getSelectedTab()).getUrlTextField().setText("");
        }
        if (e.getSource() == executeButton) {

            dexExecutor.setOperation(dexTabPanel.getSelectedIndex());
            dexExecutor.startTask();
            String response = dexExecutor.getResponse();

            if (response != null) {
                ((AbstractTab) dexTabPanel.getSelectedTab()).getResponsePane().getResponseTextArea().setText(getPrettyPrintJson(response));
            }
        }
    }

    /**
     * Get pretty print JSON
     *
     * @param res string
     * @return string
     */
    private String getPrettyPrintJson(String res) {

        String ex;
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonParser jp = new JsonParser();
            if (JsonUtil.isValidJSON(res)) {
                return gson.toJson(jp.parse(res));

            } else {
                JOptionPane.showMessageDialog(null, "Invalid Json from API end point", Constants.JSON_VALIDATION_ERROR, DEFAULT_OPTION);
                return Constants.EMPTY;
            }
        } catch (Exception e) {
            ex = e.getMessage();
            JOptionPane.showMessageDialog(null, "Invalid Json from API end point", Constants.JSON_VALIDATION_ERROR, DEFAULT_OPTION);
        }
        return ex;
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }


}
