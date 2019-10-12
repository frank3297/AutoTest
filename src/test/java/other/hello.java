package other;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.Test;

@Slf4j
public class hello {

    @Value("${url}")
    private String url;
    @Test
    public void hello() {
        System.out.println(url);

//    @Value("${server.port}")
//    private int server.port;
    }
    @Test
    public void hello1(){
        System.out.println(url);




//        String s= "dashabi";
//        log.info("{}",s);

//        String myPath=String.valueOf(DateFormat.format(DateFormat.ZH_DATE_FORMAT));
//        System.out.println("---------:"+myPath);



    }
}
