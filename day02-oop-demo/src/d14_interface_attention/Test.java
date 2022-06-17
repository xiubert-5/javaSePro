package d14_interface_attention;

public class Test {
    public static void main(String[] args) {
        /*1.接口不能创建对象
         * 2.一个类实现多个接口，多个接口中有同样的静态方法不冲突
         * 原因：接口的静态方法不能类调用，只能接口名调用，不冲突
         * 3.一个类继承了父类，同时又实现了接口，父类和接口中同名的方法默认使用父类的
         * 4.一个类实现了多个接口，多个接口中存在同名的默认方法，不冲突，这个类重写该方法即可
         * 5.一个接口继承多个接口，是没有问题的，如果多个接口中存在规范冲突则不能多继承*/
    }
}

//3.一个类继承了父类，同时又实现了接口，父类和接口中同名的方法默认使用父类的
interface Food {
    void eat();
}

class Animal {
    public void eat() {
        System.out.println("父类动物吃~~~");
    }
}

class Cat extends Animal implements Food {

}

//4.一个类实现了多个接口，多个接口中存在同名的默认方法，不冲突，这个类重写该方法即可
interface AA {
    default void go() {
        System.out.println("AA");
    }
}

interface BB {
    default void go() {
        System.out.println("BB");
    }
}

class CC implements AA, BB {

    @Override
    public void go() {
        System.out.println("CC");
    }
}
//5.一个接口继承多个接口，是没有问题的，如果多个接口中存在规范冲突则不能多继承
interface AAA{
    int run();
}

interface BBB{
    int run();
}

interface CCC extends AAA,BBB{
    @Override
    int run();
}