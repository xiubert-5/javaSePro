package d7_innerclass_anonymous;

public class Test1 {
    public static void main(String[] args) {
        /*匿名内部类
        * 本质上是一个没有名字的局部内部类，定义在方法中，代码块中
        * 作用：方便创建子类对象，最终目的为了简化代码编写
        *
        * 特点总结
        * 匿名内部类是一个没有名字的内部类
        * 匿名内部类写出来就会产生一个匿名内部类的对象
        * 匿名内部类的对象类型相当于是当前new的那个类型的子类类型*/
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("兔子跑的飞快");
            }
        };

        a.run();
    }
}

class Tiger extends Animal{

    @Override
    public void run() {
        System.out.println("老虎跑的飞快~~");
    }
}

abstract class Animal{
    public abstract void run();
}
