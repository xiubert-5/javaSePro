package d10_interface;

//    声明了一个接口：体现一种规范，规范一定是公开的
//    一个类实现接口，必须重写完全部接口的全部抽象方法，否则这个类需要定义成抽象类
public interface InterfaceDemo {
//    目标：接口中的成分特点：JDK8之前接口中只能有抽象方法和常量
//    1.常量
//    注意：由于接口体现规范思想，规范默认都是公开的，所以代码层面，public static final可以省略不写

    public static final String SCHOOL_NAME = "新余学院";
    String SCHOOL_HALL = "二食堂";

//    2.抽象方法
//    注意：由于接口体现规范思想，规范默认都是公开的，所以代码层面，public abstract 可以省略不写

    void fly();

    public abstract void run();

    public abstract void eat();


}
