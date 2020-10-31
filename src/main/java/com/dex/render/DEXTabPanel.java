package com.dex.render;

import com.dex.tabs.DeleteTab;
import com.dex.tabs.GetTab;
import com.dex.tabs.PostTab;
import com.dex.tabs.PutTab;

import javax.swing.*;
import java.awt.*;

public class DEXTabPanel extends JPanel {

    JTabbedPane tabbedPane = new JTabbedPane();

    public DEXTabPanel() {
        super(true);


        JPanel panel1 = new GetTab();
        tabbedPane.addTab("GET", null, panel1, "GET Request Testing");
        tabbedPane.setSelectedIndex(0);

        Component panel2 = new PostTab();
        tabbedPane.addTab("POST", null, panel2, "Does nothing");

        Component panel3 = new PutTab();
        tabbedPane.addTab("PUT", null, panel3, "Does nothing");

        Component panel4 = new DeleteTab();
        tabbedPane.addTab("DELETE", null, panel4, "Does nothing");

        //Add the tabbed pane to this panel.
        setLayout(new GridLayout(1, 0));
        add(tabbedPane);
    }

    private Component makeCustomPanel(String text) {
        JPanel panel = new JPanel();
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 0));
        panel.add(filler);
        return panel;
    }
}
