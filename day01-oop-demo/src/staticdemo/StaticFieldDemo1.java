package staticdemo;

public class StaticFieldDemo1 {
    public static void main(String[] args) {
        //目标：理解static修饰成员变量的作用和访问特点
        //1. 类名.静态成员变量
        System.out.println(User.onlineNumber);

        User u = new User();
        User.onlineNumber++;
        System.out.println(User.onlineNumber);

    }
}
