package d2_SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
    //    目标：学会使用SimpleDateFormat解析字符串时间成为日期对象
    //    调用parse来进行字符串时间解析
    //    有一个时间2021年08月06日11:11:11 往后走2天14小时49分06秒后的时间是多少
    //    1.把字符串时间拿到程序中来
        String dateStr = "2021年08月06日 11:11:11";

    //    2.把字符串时间解析成日期对象，注意：形式必须与被解析形式完全一样
        SimpleDateFormat d = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date e = d.parse(dateStr);

    //    3.往后走
        long time = e.getTime() + (2*24*60*60+14*60*60+49*60+6)*1000;


    //    4，格式化这个时间毫秒值
        String sc = d.format(time);
        System.out.println(sc);

    }
}
