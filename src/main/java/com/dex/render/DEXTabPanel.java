package com.dex.render;

import javax.swing.*;
import java.awt.*;

public class DEXTabPanel extends JPanel {

    JTabbedPane tabbedPane = new JTabbedPane();

    public DEXTabPanel() {
        super(true);     		    // true = please double buffer

        //PENDING: Add icons to tabs.

        Component panel1 = makeTextPanel("Blah");
        //ImageIcon tinyPanel1 = new ImageIcon("tinypanel1.gif");
        tabbedPane.addTab("GET", null, panel1, "Does nothing");
        tabbedPane.setSelectedIndex(0);

        Component panel2 = makeTextPanel("Blah blah");
        //ImageIcon tinyPanel2 = new ImageIcon("tinypanel2.gif");
        tabbedPane.addTab("POST", null, panel2, "Does nothing");

        Component panel3 = makeTextPanel("Blah blah blah");
        //ImageIcon tinyPanel3 = new ImageIcon("tinypanel3.gif");
        tabbedPane.addTab("PUT", null, panel3, "Does nothing");

        Component panel4 = makeTextPanel("Blah blah blah blah");
        //ImageIcon tinyPanel4 = new ImageIcon("tinypanel4.gif");
        tabbedPane.addTab("DELETE", null, panel4, "Does nothing");

        //Add the tabbed pane to this panel.
        setLayout(new GridLayout(1, 0));
        add(tabbedPane);
    }

    private Component makeTextPanel(String text) {
        JPanel panel = new JPanel();
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 0));
        panel.add(filler);
        return panel;
    }
}
