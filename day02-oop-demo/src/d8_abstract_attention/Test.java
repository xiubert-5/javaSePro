package d8_abstract_attention;

public class Test {
    public static void main(String[] args) {
        //    目标：理解抽象类的特征和注意事项
        //    1.类有的东西，抽象类都有
        //    2.抽象类中可以没有抽象方法，但是有抽象方法的必须是抽象类
        //    3.一个类继承了抽象类，必须重写完抽象类的全部抽象方法，否则这个类也必须定义成抽象类
        //    4.不能用abstract修饰变量，代码块，构造器

        //    5.抽象类得到了抽象方法，失去了创建对象的能力
        /*
         *为什么？
         *反证法：假如抽象类可以创建对象
         *Animal a = new Animal();
         * a.run(); run()是抽象方法，没有抽象体 报错
         * */

        //    6.final和abstract是互斥关系，abstract定义的抽象类作为模板让子类继承，final定义的类不能被继承
    }
}

class Cat extends Animal {

    @Override
    public void run() {
        System.out.println("猫猫在跑");
    }

    @Override
    public void eat() {
        System.out.println("猫猫在吃猫条");
    }
}


abstract class Animal {
    public abstract void run();

    public abstract void eat();

}