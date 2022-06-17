package extendsdemo6;

public class Dog extends Animal {
    public Dog(){
        System.out.println("子类Dog无参数构造器被执行~");

    }

    public Dog(String name){
        System.out.println("子类Dog有参数构造器被执行~");
    }
}
