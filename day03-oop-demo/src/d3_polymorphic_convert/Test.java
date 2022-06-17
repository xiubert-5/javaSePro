package d3_polymorphic_convert;

public class Test {
    public static void main(String[] args) {
        //自动类型转换
        Animal a = new Dog();
        a.run();



        //强制类型转换
        Animal a1 = new Tortoise();
        a1.run();

        /*强制类型转换：子类 对象变量 = （子类）父类类型的变量
         * 作用：可以解决多态下的劣势，可以实现调用子类独有的功能
         * 注意：如果转型后的类型和对象真实类型不是同一种类型，那么在转换的时候就会出现ClassCastException*/


        //从父类类型到子类类型，必须强制类型转换


        //强制类型转换，编译阶段不报错，运行可能出错
        //java建议强转转换之前使用instanceof判断当前对象的真实类型，再进行强制转换
        if (a1 instanceof Tortoise) {
            Tortoise t = (Tortoise) a1;
            t.defend();
        } else if (a1 instanceof Dog){
            Dog d = (Dog) a1;
            d.seek();
        }

    }
    public void go(Animal a){
        if (a instanceof Tortoise) {
            Tortoise t = (Tortoise) a;
            t.defend();
        } else if (a instanceof Dog){
            Dog d = (Dog) a;
            d.seek();
        }
    }
}
