package d5_integer;

import java.time.Instant;

public class Test {
    public static void main(String[] args) {
        /*包装类是什么
        * 基本数据类型对应的引用类型
        * 实现了一切皆对象
        * 后期集合和泛型不支持基本类型，只能使用包装类
        *
        * 包装类有哪些特殊功能
        * 可以直接加字符串得到字符串类型
        * 可以把字符串类型的数值转换成真实的数据类型*/

        //包装类的变量默认值可以是null，容错率更高

        int a = 10;
        Integer a1 = 11;
        Integer a2 = a;//自动装箱
        System.out.println(a1);
        System.out.println(a2);

        Integer it = 100;
        int it1 = it;//自动拆箱
        System.out.println(it1);

        double db = 99.5;
        Double db2 = db;
        double db3 = db2;
        System.out.println(db3);

        System.out.println("-------------------");
        //可以把基本类型的数据转换成字符串类型
        Integer i3 = 23;
        String rs = i3.toString();
        System.out.println(rs + 1);

        String ra = Integer.toString(i3);
        System.out.println(ra);

        //可以直接加字符串得到字符串类型
        String rs1 = i3 + "";
        System.out.println(rs1 + 1);
        System.out.println("---------------------");

        //可以把字符串类型的数值转换成真实的数据类型
        String number = "20";
        String number1 = "20.4";
        //转换成整数
        int age = Integer.valueOf(number);
        System.out.println(age + 1);

        //转换小数
        double age1 = Double.valueOf(number1);
        System.out.println(age1 + 1);



    }
}
