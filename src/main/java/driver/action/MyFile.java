package driver.action;


import lombok.extern.slf4j.Slf4j;
import java.io.File;


@Slf4j
public class MyFile {
    //判断文件是否存在
    public static boolean fileExist(String filePath){
        return new File(filePath).exists();
    }
    //先判断文件是否存在，没有就创建文件
    public static void createFile1(String filePath){
        if (!MyFile.fileExist(filePath)){
            File file=new File(filePath);
            file.mkdir();
            log.info("文件创建成功");
        }
    }

}
