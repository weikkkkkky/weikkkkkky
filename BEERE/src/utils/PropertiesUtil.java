package utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

    public static Properties config = null;

    static {
        InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream("user.properties");
        config = new Properties();
        try {
            config.load(in);
            in.close();
        } catch (IOException e) {
            System.out.println("No officeToSwf.properties defined error");
        }
    }
}

