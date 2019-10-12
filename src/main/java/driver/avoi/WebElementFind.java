package driver.avoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebElementFind extends BrowserDriver {
    public static WebElement findElement(final By by){
        WebElement webElement=null;
        try {
            webElement=new WebDriverWait(driver,10).until(new ExpectedCondition<WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(by);
                }
            });
        }catch (Exception e){
            System.out.print("元素"+by+"没找着");
            e.printStackTrace();
        }
        return webElement;
    }

    public static WebElement findElementBigFile(final By by){
        WebElement webElement=null;
        try {
            webElement=new WebDriverWait(driver,600).until(new ExpectedCondition<WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(by);
                }
            });
        }catch (Exception e){
            System.out.print("元素"+by+"没找着");
            e.printStackTrace();
        }
        return webElement;
    }

    public static List<WebElement> findElements(final By by){
        List<WebElement> webElements=null;
        try {
            webElements=new WebDriverWait(driver,10).until(new ExpectedCondition<List<WebElement>>(){
                public List<WebElement> apply(WebDriver driver) {
                    return driver.findElements(by);
                }
            });
        }catch (Exception e){
            System.out.print("元素"+by+"定位超时");
            e.printStackTrace();
        }
        return webElements;
    }
}
