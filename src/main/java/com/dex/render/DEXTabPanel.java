package com.dex.render;

import com.dex.tabs.DeleteTab;
import com.dex.tabs.GetTab;
import com.dex.tabs.PostTab;
import com.dex.tabs.PutTab;
import com.dex.util.Constants;

import javax.swing.*;
import java.awt.*;

public class DEXTabPanel extends JPanel {

    private JTabbedPane tabbedPane = new JTabbedPane();
    private JPanel getTabPanel = new GetTab();
    private JPanel postTabPanel = new PostTab();
    private JPanel putTabPanel = new PutTab();
    private JPanel deleteTabPanel = new DeleteTab();

    public DEXTabPanel() {
        super(true);

        tabbedPane.addTab(Constants.GET_METHOD, null, getTabPanel, "GET Request Testing");
        tabbedPane.setSelectedIndex(0);
        tabbedPane.addTab("POST", null, postTabPanel, "Does nothing");
        tabbedPane.addTab("PUT", null, putTabPanel, "Does nothing");
        tabbedPane.addTab("DELETE", null, deleteTabPanel, "Does nothing");

        //Add the tabbed pane to this panel.
        setLayout(new GridLayout(1, 0));
        add(tabbedPane);
    }

    public JPanel getGetTabPanel() {
        return getTabPanel;
    }

    public JPanel getPostTabPanel() {
        return postTabPanel;
    }

    public JPanel getPutTabPanel() {
        return putTabPanel;
    }

    public JPanel getDeleteTabPanel() {
        return deleteTabPanel;
    }

}
