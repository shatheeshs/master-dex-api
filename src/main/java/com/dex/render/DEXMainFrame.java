package com.dex.render;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DEXMainFrame extends JFrame implements ActionListener, WindowListener {


    private static DEXMainFrame DEXMainFrameInstance;
    private DEXTabPanel dexTabPanel = new DEXTabPanel();
    private JPanel mainButtonPanel = new JPanel();
    private JButton executeButton = new JButton("Execute");
    private JButton resetButton = new JButton("Reset");

    private DEXMainFrame() {
        initGUI();
    }

    public static synchronized DEXMainFrame getInstance() {
        if (DEXMainFrameInstance == null) {
            DEXMainFrameInstance = new DEXMainFrame();
        }
        return DEXMainFrameInstance;
    }

    private void initGUI() {

        setDefaultLookAndFeelDecorated(true);
        this.setLayout(new GridBagLayout());
        mainButtonPanel.setLayout(new GridBagLayout());

        this.setTitle("MasterDEX");
        this.setSize(1000, 600);

        this.add(dexTabPanel, new GridBagConstraints(1,0, 1, 1 ,1,10, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0) , 0, 0));

        mainButtonPanel.add(resetButton , new GridBagConstraints(0,0, 1, 1 ,10,1, GridBagConstraints.EAST, GridBagConstraints.VERTICAL, new Insets(0,0,0,0) , 50, 0));
        mainButtonPanel.add(executeButton , new GridBagConstraints(1,0, 1, 1 ,0.2,1, GridBagConstraints.EAST, GridBagConstraints.VERTICAL, new Insets(0,0,0,5) , 40, 0));
        this.add(mainButtonPanel, new GridBagConstraints(1,1, 1, 1 ,1,0.1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0) , 0, 0));

        this.addWindowListener(this);
        //Display the window.
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == "SS") {
            System.out.println("asfaf");
        }
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
