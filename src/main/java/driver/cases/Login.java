package driver.cases;

import driver.action.MyProperties;
import driver.avoi.Action;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Slf4j
public class Login {

    public static void login(WebDriver driver,String user,String password) {
        try {
            String url = MyProperties.getProperties("url");
            driver.get(url);
            log.info("打开了:{}",url);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.manage().window().maximize();

        Action.clear(By.xpath("//input[@type='text']"));
        Action.sendkey(By.xpath("//input[@type='text']"),user);
        Action.clear(By.xpath("//input[@type='password']"));
        Action.sendkey(By.xpath("//input[@type='password']"),password);
        Action.click(By.className("btn"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
