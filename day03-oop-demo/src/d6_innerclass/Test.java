package d6_innerclass;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();

        /*成员内部类
        * 无static修饰，属于外部类的对象
        * 可以直接访问外部类的静态成员，实例方法中可以直接访问外部类的实例成员
        *
        * 成员内部类如何创建对象
        * 外部类名.内部类名. 对象名 = new 外部类构造器（）.new 内部类构造器（）;*/

    }
}

class People{
    private int heartbeat = 150;
    public class Heart{
        private int heartbeat = 110;
        public void show(){
            int heartbeat = 78;
            System.out.println();
        }
    }
}
