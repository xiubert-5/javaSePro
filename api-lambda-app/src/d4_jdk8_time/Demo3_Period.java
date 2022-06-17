package d4_jdk8_time;

import java.time.LocalDate;
import java.time.Period;

public class Demo3_Period {
    public static void main(String[] args) {
        //Period 在java8中，我们可以使用以下类来计算日期间隔差异:java.time.Period
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //生日的 年月日
        LocalDate birthDate = LocalDate.of(2001,10,8);
        System.out.println(birthDate);

        Period period = Period.between(birthDate,today);
        System.out.println(period.getYears()+"年");
        System.out.println(period.getMonths()+"月");
        System.out.println(period.getDays()+"日");
    }
}
