package extendsdemo4;

public class Test {
    public static void main(String[] args) {
    //    目标 ：理解继承后成员的访问特点： 就近原则
    //    super关键字
        Dog d = new Dog();
        d.run();
        d.lookDoor();
        d.showName();

    }
}

class Animal{

    public String name = "动物名";

    public void run(){
        System.out.println("可以跑起来~~");
    }
}

class Dog extends Animal{

    public String name = "狗名";

    public void showName(){
        String name = "局部名";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void lookDoor(){
        System.out.println("狗可以看门");
    }

    public void run(){
        System.out.println("狗可以跑的贼快~~");
    }

}


