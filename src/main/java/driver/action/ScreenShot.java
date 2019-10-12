package driver.action;

import driver.avoi.BrowserDriver;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

import java.io.File;
import java.io.IOException;

@Slf4j
public class ScreenShot extends BrowserDriver {

    static String path = System.getProperties().getProperty("user.dir") + "\\error\\";
    /**
     * 错误截图，通过日期命名的截图
     **/
    public static void screenShots() {
        WebDriver augmentedDriver = new Augmenter().augment(driver);
        //生成截图
        File file = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);

        MyFile myFile=new MyFile();
        //获取当前时间的路径
        String myPath=path+DateFormat.format(DateFormat.CHECK_LOG_FORMAT);
        myFile.createFile1(myPath);
        try {
             String times= DateFormat.format(DateFormat.REPORT_CSV_FORMAT);
             FileUtils.copyFile(file,new File(myPath + "\\" +times+".jpg"));

        } catch (IOException e) {
            log.error("截图失败！！");
            e.printStackTrace();
        }
    }
    /**
     * 错误截图,通过传入name来给截图命名
     **/
//    public static void screenShots1(String name) {
//        WebDriver augmentedDriver = new Augmenter().augment(driver);
//        File file = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
//        try {
//            MyFile myFile = new MyFile();
//            myFile.createFile1(path + DateFormat.format(DateFormat.CHECK_LOG_FORMAT));
//            log.info(DateFormat.format(DateFormat.ZH_DATE_FORMAT));
//            FileUtils.copyFile(file,new File(path + DateFormat.format(DateFormat.CHECK_LOG_FORMAT) + "/" + name + ".jpg"));
//        } catch (IOException e) {
//            log.error("截图失败！！");
//            e.printStackTrace();
//        }
//    }

    /**
     * 判断文件夹，没有就新建
     */
/*    public static void fileExists() {
        String fileName = DateUtil.format(DateUtil.CHECK_LOG_FORMAT);
        File file = new File(path + fileName);
        if (!file.exists()) {
            file.mkdirs();
        }
    }*/
}
