package d5_innerckass_staic;

public class Test {
    public static void main(String[] args) {
        /*什么是静态内部类
        * 有static修饰，属于外部类本身
        * 特点和使用与普通类是完全一样的，类的成分都有，只是位置在外部类里面
        * 静态内部类创建对象的格式
        * 外部类名.内部类名 对象名 = new 外部类名.内部类构造器
        * 范例：*/
        Outer.Inner in = new Outer.Inner();

    }
}
