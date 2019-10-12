package other;

import driver.action.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class testtime {
    public static void main(String[] args){
//        String myPath=String.valueOf(new SimpleDateFormat("yyyyMMdd"));
//        System.out.println("---------:"+myPath);
//
//        long s = System.currentTimeMillis();
//        System.out.println(s);
//        //new日期对
//
//        Date date = new Date(s);
//
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
//        System.out.println(dateFormat);

//        Date date =new Date();
//        SimpleDateFormat sdf =new SimpleDateFormat("HH:mm:ss");//只有时分秒
//        SimpleDateFormat sdf =new SimpleDateFormat(DateFormat.REPORT_CSV_FORMAT);//完整的时间
//        String time=sdf.format(new Date());
//        System.out.println(time);
        DateFormat.format(DateFormat.REPORT_CSV_FORMAT);




    }

}
