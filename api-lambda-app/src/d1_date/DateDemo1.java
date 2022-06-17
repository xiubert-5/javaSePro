package d1_date;

import java.util.Date;

/*目标：学会使用data类处理时间，获取时间的信息*/
public class DateDemo1 {
    public static void main(String[] args) {
        /*1.创建一个Data类的对象：代表系统此刻日期时间对象*/
        Date d = new Date();
        System.out.println(d);

        /*2.获取时间毫米值*/
        //long time = d.getTime();
        //System.out.println(time);
        //
        //计算出当前时间往后走1小时121秒之后的时间是多少
        //1.得到当前时间
        long time1 = System.currentTimeMillis();
        time1 += (60 * 60 + 121) * 1000;

        //2.把时间毫秒值转换成对应的日期对象
        Date d2 = new Date(time1);
        System.out.println(d2);

        /*1.日期对象如何创建，如何获取时间毫秒值
         * Data data = new Data();
         * Long time = data.getTime();
         *
         * 2.时间毫秒值怎么恢复成日期对象
         * Data d = new Date(time);
         * d.setTime(time);*/


    }
}
