package d4_jdk8_time;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class Demo1Instant {
    public static void main(String[] args) {
        //1.得到一个insant时间戳对象
        //标准时间 时区差8个小时
        Instant instant = Instant.now();
        System.out.println(instant);

        //2.系统此刻的时间戳
        Instant instant1 = Instant.now();
        System.out.println(instant1.atZone(ZoneId.systemDefault()));

    //    比较前后
        System.out.println(instant.isAfter(instant1));

        //如何去返回date对象
        Date date = Date.from(instant1);
        System.out.println(date);

        Instant i1 = date.toInstant();
        System.out.println(i1);

        SimpleDateFormat b = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String time = b.format(date);
        System.out.println(time);

    }
}
