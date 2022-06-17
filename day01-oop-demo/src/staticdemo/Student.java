package staticdemo;

public class Student {

    private String name;

    /*
    静态成员方法
    有static修饰，归属于类，可以被共享访问，用类名或者对象名都可以访问
     */

    public static int getMax(int age1, int age2) {
        return age1 > age2 ? age1 : age2;
    }


    /*
    实例方法
    */

    public void study(){
        System.out.println(name + "在好好学习，天天向上");

    }


    public static void main(String[] args) {

        //1.类名. 静态成员方法
        System.out.println(getMax(18, 2));
        //注意：同一个类中，访问静态方法，类名可以省略不写
        System.out.println(Student.getMax(23, 213));

        Student s = new Student();
        s.name = "123";
        s.study();

    }

}
