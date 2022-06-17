package d2_SimpleDateFormat;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date time = new Date();
        System.out.println(time);

        long time1 = time.getTime();
        System.out.println(time1);

        //格式化时间常用格式
        //2020-11-11 13:27:06 - yyyy-MM-dd HH:mm:ss EEE 星期几 a上午或者下午
        SimpleDateFormat y = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        SimpleDateFormat d = new SimpleDateFormat();

        //开始格式化日期对象成为喜欢的字符串形式
        String rs = y.format(time);
        System.out.println(y.format(time).toString());
        System.out.println(rs);
        //System.out.println(y.format(time));
        //System.out.println(y.format(time1));
        //System.out.println(d.format(time));
        //System.out.println(d.format(time1));


    //    格式化时间毫米值
        long time3 = System.currentTimeMillis() + 121 * 1000;
        String rc = y.format(time3);
        System.out.println(rc);

    }
}
