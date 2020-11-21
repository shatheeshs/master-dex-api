package com.dex.config;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class DEXConfigs {

    public static Properties loadProperties() {

        InputStream inputStream;
        Properties prop = new Properties();
        try {
            String propFileName = "config.properties";

            inputStream = DEXConfigs.class.getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }
}
