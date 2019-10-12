package driver.action;


import java.io.*;
import java.util.Properties;

public class MyProperties {
     public static String getProperties(String key) throws Exception {
          String value;

          InputStream in = new BufferedInputStream(new FileInputStream(
                  new File("src\\main\\resources\\application.properties")));

          java.util.Properties prop = new java.util.Properties();

          prop.load(in);

          value = prop.getProperty(key);

          return  value;


     }
}
