package com.dex;

import com.dex.config.DEXConfigs;
import com.dex.render.DEXMainFrame;
import com.dex.util.CommonUtil;
import com.dex.util.Constants;

import javax.swing.*;
import java.util.Properties;

import static javax.swing.JOptionPane.DEFAULT_OPTION;

public class MasterDexMain {

    public static void main(String[] args) {

        StringBuilder lookAndFeel = new StringBuilder("com.sun.java.swing.plaf.");
        StringBuilder mainTitle = new StringBuilder("MasterDEX ");
        try {
            Properties properties = DEXConfigs.loadProperties();
            if (properties.get(Constants.LOOK_AND_FEEL) != null) {
                lookAndFeel.append(properties.get(Constants.LOOK_AND_FEEL));
                UIManager.setLookAndFeel(lookAndFeel.toString());
            }

            String version = MasterDexMain.class.getPackage().getImplementationVersion();
            if (CommonUtil.isEmptyOrNullString(version)) {
                version = "[DEV]";
            }

            mainTitle.append(version);
            DEXMainFrame dexMainFrame = DEXMainFrame.getInstance();
            dexMainFrame.setTitle(mainTitle.toString());
            dexMainFrame.init();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid property value. Please check config.properties", Constants.APP_CONFIG_FAILURE, DEFAULT_OPTION);
            e.printStackTrace();
        }

    }
}
