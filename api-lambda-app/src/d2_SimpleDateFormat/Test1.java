package d2_SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        //    秒杀开始时间：2020年11月11日 00:00:00
        //    秒杀结束时间：2020年11月11日 00:10:00
        String d1 = "2020年11月11日 00:03:47";
        String d2 = "2020年11月11日 00:10:11";

        String start = "2020年11月11日 00:00:00";
        String end = "2020年11月11日 00:10:00";

        SimpleDateFormat d = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d11 = d.parse(d1);
        Date d22 = d.parse(d2);
        Date s1 = d.parse(start);
        Date e1 = d.parse(end);

        //long time1 = d11.getTime();
        //long time2 = d22.getTime();
        //long time3 = s1.getTime();
        //long time4 = e1.getTime();

        //    先判断小贾
        if (d11.after(s1) && d11.before(e1)) {
            System.out.println("小贾在规定时间内参加了活动");
        } else {
            System.out.println("小贾没有在规定时间内参加活动");
        }

        //    判断小皮
        if (d22.after(s1) && d22.before(e1)) {
            System.out.println("小皮在规定时间内参加了活动");
        } else {
            System.out.println("小皮没有在规定时间内参加活动");
        }
    }
}
