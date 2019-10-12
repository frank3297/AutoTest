package driver.avoi;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Action {
    public static void click(By by){
        WebElementFind.findElement(by).click();
        log.info("点击：{}",by);
    }
    public static void sendkey(By by,String text){
        WebElementFind.findElement(by).sendKeys(text);
        log.info("在"+by+"输入"+text);
    }

    public static void clear(By by){
        WebElementFind.findElement(by).clear();
    }

    public static String getText(By by){
        String text=WebElementFind.findElement(by).getText();
        return text;
    }
    public static ArrayList getTexts(By by){
        ArrayList arryList=new ArrayList();
        List<WebElement> webElement=WebElementFind.findElements(by);
        for(int j=0;j<webElement.size();j++){
            String text=webElement.get(j).getText();
            arryList.add(text);
        }
        return arryList;
    }
}
