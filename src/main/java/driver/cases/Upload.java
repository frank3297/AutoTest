package driver.cases;

import driver.avoi.Action;
import driver.action.UserDirPath;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Slf4j
public class Upload {
    public static void upload(WebDriver driver,String  relativePath){
        log.info("点击DOCUMENT");
        Action.click(By.xpath("//li[@class='is-focus is-tabs']"));
        log.info("点击上传按钮并传值");
        Action.sendkey(By.xpath("//input[@id = 'file' and @name= 'file']"), UserDirPath.path + relativePath);

    }
}
