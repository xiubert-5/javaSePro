package d1_polymorphic;

public class Test {
    public static void main(String[] args) {
        //    1.多态的形式： 父类类型 对象名称 = new 子类构造器;
        Animal a = new Dog();
        a.run();
        System.out.println(a.name);

        Animal b = new Tortoise();
        b.run();
        System.out.println(b.name);

        //    2.多态中成员访问特点
        //    方法调用：编译看左边，运行看右边
        //    变量调用：编译看左边，运行也看左边（多态侧重行为多态）

    //    多态的前提：有继承/实现关系，有父类引用指向子类对象，有方法重写

    }
}
