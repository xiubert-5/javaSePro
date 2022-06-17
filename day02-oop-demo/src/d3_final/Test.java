package d3_final;

public class Test {


    public static final String schoolName = "黑马";


    public static void main(String[] args) {
        // 目标：记住final的语法
        // 1.final修饰类，类不能被继承
        // 2.final修饰方法，方法不能被重写
        // 3.final修饰变量，总规则：变量有且仅能被赋值一次
        // 4.final修饰引用类型的变量，变量存储的地址值不能发生改变，但是地址指向的对象内容是可以发生改变的

        final double rate = 3.14;

        //

    }
}


//class People{
//    public final void eat(){
//        System.out.println("-----吃东西-----");
//    }
//}
//
//class Student extends People{
//    @Override
//    public void eat() {
//        System.out.println("小杨吃的很多");
//    }
//}

//class Wolf extends Animal{
//
//}
//
//final class Animal{
//
//}
