package d3_Calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        //1.拿到系统此刻日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        //2.获取日历信息：public int get(int field); 取日期中的某个字段信息
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        int mm = cal.get(Calendar.MONTH) + 1;
        System.out.println(mm);
        int days = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //3.修改日历的某个字段信息
        cal.set(Calendar.HOUR,12);
        int hour = cal.get(Calendar.HOUR);
        System.out.println(hour);

        //4.为某个字段增加减少指定的值
        //增加64天
        cal.add(Calendar.DAY_OF_YEAR,64);
        cal.add(Calendar.MINUTE,59);

        //5.拿到此刻日期对象
        Date d = cal.getTime();
        System.out.println(d);


    }
}
