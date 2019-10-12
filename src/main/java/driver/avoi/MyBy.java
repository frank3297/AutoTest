package driver.avoi;

import org.openqa.selenium.By;

public class MyBy{
    //封装获取上传成功的框体，想过等同于By.ByXPath
    public static By getTextSucess = By.xpath("//li[@class='msg-list']/div[@class='msg-type']/span[text()='上传成功']");

}
