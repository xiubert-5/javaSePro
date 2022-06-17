package d3_polymorphic_convert;

public class Dog extends Animal {
    public String name = "子类狗";

    public void seek(){
        System.out.println("狗狗在寻找东西");
    }

    @Override
    public void run() {
        System.out.println("狗跑的贼快~");
    }
}
