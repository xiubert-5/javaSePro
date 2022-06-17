package staticdemo;

public class User {
    /*
     * 在线人数
     * 注意：static修饰的成员变量 静态成员变量在内存中只有一份，可以共享
     *
     * */
    public static int onlineNumber = 161;
    /*
    实例成员变量：无static修饰，属于每个对象的，必须用对象名访问


    */
    private String name;
    private int age;


    public static void main(String[] args) {
        //目标：理解static修饰成员变量的作用和访问特点
        //1. 类名.静态成员变量
        System.out.println(User.onlineNumber);

        //2.对象名.实例成员变量
        User u = new User();
        u.onlineNumber++;
        u.name = "张三";
        u.age = 21;
        System.out.println(User.onlineNumber);

        // 注意：同一个类中静态成员变量的访问可以省略类名
        System.out.println(onlineNumber);

    }
}

