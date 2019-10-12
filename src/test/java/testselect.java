import driver.avoi.Action;
import driver.avoi.BrowserDriver;
import driver.avoi.WebElementFind;
import driver.cases.LoginSuccess;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
@Slf4j
public class testselect {
    WebDriver driver;

    @BeforeMethod
    public void testopenbrowser() throws InterruptedException {
        driver = BrowserDriver.openbrowser();
    }

    @Test
    public void testcloud() throws InterruptedException {
        LoginSuccess.loginSuccess(driver);
        log.info("点击DOCUMENT");
        Action.click(By.xpath("//li[@class='is-focus is-tabs']"));
        String path ="//tr[@class='el-table__row']/td[2]/div/span[contains(text(),'Document')]";
        String checkboxpath ="//tr[@class='el-table__row']/td[2]/div/span[contains(text(),'Document')]/parent::*/parent::*/parent::*/td[1]/div/*/span";
//       String s4 ="//tr[@class='el-table__row']/td[2]/div/span[contains(text(),'Document')]"
        String s = WebElementFind.findElement(By.xpath(path)).getText();
        Action.click(By.xpath(checkboxpath));
        System.out.println("hah"+s+"hah");

    }

    @AfterMethod
    public void testclosevrowser() throws InterruptedException {
        BrowserDriver.closebrowser();
    }

}
