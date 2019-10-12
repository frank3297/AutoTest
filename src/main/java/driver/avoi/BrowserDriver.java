package driver.avoi;

import driver.action.MyProperties;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
@Slf4j

public class BrowserDriver {
    public static WebDriver driver;

    public static WebDriver openbrowser() {
        String browsering = null;
        try {
            browsering = MyProperties.getProperties("browser");
        } catch (Exception e) {
            e.printStackTrace();
        }


        if ("chrome".equals(browsering)) {
            //打开chrome浏览器
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if ("firefox".equals(browsering)) {
            //打开firefox浏览器
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
//            ProfilesIni allProfiles = new ProfilesIni();
//            FirefoxProfile profile = allProfiles.getProfile("default");
//            FirefoxOptions options = new FirefoxOptions();
//            options.setProfile(profile);
            //创建一个叫driver的对象，启动火狐浏览器
            driver = new FirefoxDriver();
            System.out.println("到这里了吗。。。。。。。。。。");
        } else if ("ie".equals(browsering)){
            //打开ie浏览器
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
         }else{
            log.error("未获取到 {} 浏览器",browsering);
            System.exit(0);
        }



         return driver;
    }

    public static void closebrowser(){
        log.info("关闭了浏览器");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}
