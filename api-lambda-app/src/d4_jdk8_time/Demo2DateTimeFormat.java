package d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Demo2DateTimeFormat {
    public static void main(String[] args) {
        //本地时刻 日期时间 对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        //正向格式化
        System.out.println(dtf.format(ldt));
        //逆向格式化
        System.out.println(ldt.format(dtf));


        //解析字符串时间
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //解析当前字符串时间成为本地日期时间对象
        LocalDateTime ldt1 = LocalDateTime.parse("2020-10-08 03:00:00",dtf1);

        System.out.println(ldt1);
        System.out.println(ldt1.getDayOfMonth());

    }
}
