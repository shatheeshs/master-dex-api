package com.dex.render;

import com.dex.tabs.DeleteTab;
import com.dex.tabs.GetTab;
import com.dex.tabs.PostTab;
import com.dex.tabs.PutTab;

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

        tabbedPane.addTab("GET", null, getTabPanel, "GET Request Testing");
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

    public void setGetTabPanel(JPanel getTabPanel) {
        this.getTabPanel = getTabPanel;
    }

    public JPanel getPostTabPanel() {
        return postTabPanel;
    }

    public void setPostTabPanel(JPanel postTabPanel) {
        this.postTabPanel = postTabPanel;
    }

    public JPanel getPutTabPanel() {
        return putTabPanel;
    }

    public void setPutTabPanel(JPanel putTabPanel) {
        this.putTabPanel = putTabPanel;
    }

    public JPanel getDeleteTabPanel() {
        return deleteTabPanel;
    }

    public void setDeleteTabPanel(JPanel deleteTabPanel) {
        this.deleteTabPanel = deleteTabPanel;
    }
}
