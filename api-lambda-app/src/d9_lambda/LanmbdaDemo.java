package d9_lambda;

public class LanmbdaDemo {
    public static void main(String[] args) {
        //目标：学会使用Lambda的标准格式简化匿名内部类的代码形式
        //注意：Lambda表达式只能简化函数式接口的匿名内部类的写法形式
        /*函数式接口
        * 首先必须是接口，其次接口中有且仅有一个抽象方法的形式·*/
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("乌龟在跑的飞快~~~~~");
            }
        };
        a.run();
    }
}

abstract class Animal{
    public abstract void run();
}
