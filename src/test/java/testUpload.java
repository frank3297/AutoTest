import driver.avoi.MyBy;
import driver.avoi.Action;
import driver.action.MyAssert;
import driver.avoi.BrowserDriver;
import driver.avoi.WebElementFind;
import driver.cases.LoginSuccess;
import driver.cases.Upload;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

@Slf4j
public class testUpload {
    WebDriver driver;

    @BeforeMethod
    public void startlogin(){
        driver =BrowserDriver.openbrowser();
    }

    @Test
    public void upload() throws InterruptedException {
        LoginSuccess.loginSuccess(driver);
        Upload.upload(driver, "files\\人性禁岛.epub");
        String text = Action.getText(MyBy.getTextSucess);

        log.info("获取到text()值：{}",text);
        MyAssert.assertEquals(text,"上传成功");
    }

    @Test
    public void uploadBigFile() throws InterruptedException {
        LoginSuccess.loginSuccess(driver);
        //传大文件
        Upload.upload(driver, "files\\同步逻辑.note");
        String textbigfile = WebElementFind.findElementBigFile(MyBy.getTextSucess).getText();
        log.info("获取到text()值：{}",textbigfile);
        MyAssert.assertEquals(textbigfile,"上传成功");
    }

    @AfterMethod
    public void closebrowser(){
        BrowserDriver.closebrowser();
    }

}
