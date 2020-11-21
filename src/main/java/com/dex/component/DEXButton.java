package com.dex.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DEXButton extends JButton implements MouseListener {

    public DEXButton(Icon icon) {
        super(icon);
        initGUIForImageButton();
    }

    public DEXButton(String title) {
        super(title);
        initGUIForNormal();
    }
    private void initGUIForNormal() {
        this.setPreferredSize(new Dimension(58, 25));
        this.addMouseListener(this);
    }

    private void initGUIForImageButton() {
        this.setPreferredSize(new Dimension(58, 25));
        this.setFocusPainted(false);
        this.setRolloverEnabled(false);
        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.addMouseListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) { }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
