import driver.action.MyAssert;
import driver.cases.Login;
import driver.cases.LoginSuccess;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.*;

import driver.avoi.BrowserDriver;

@Slf4j
public class testLogin {
    WebDriver driver;

    @BeforeMethod
    public void testopenbrowser() throws InterruptedException {
        driver =BrowserDriver.openbrowser();
    }

    @Test
    public void testcloud() throws InterruptedException {
        LoginSuccess.loginSuccess(driver);
        String title = driver.getTitle();
        log.info("获取到title:{}",title);
        MyAssert.assertEquals(title,"Supernote Cloud");
    }

    @DataProvider(name = "testlogin")
    public static  Object[][] userpass(){
        return new Object[][] {
                {"17721372329","ratta123456"},
                {"17721372329","1212"}
        };
    }

    @Test(dataProvider = "testlogin")
    public void testcloud1(String user,String password) throws InterruptedException {
        Login.login(driver,user,password);
        System.out.println("ss");
        String title = driver.getTitle();
        log.info("获取到title:{}",title);
        MyAssert.assertEquals(title,"Supernote Cloud");
    }

    @AfterMethod
    public void testclosevrowser() throws InterruptedException {
        BrowserDriver.closebrowser();
    }
}
