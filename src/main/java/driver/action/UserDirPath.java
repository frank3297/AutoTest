package driver.action;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserDirPath {
    public static String path = System.getProperties().getProperty("user.dir") + "\\";

}
