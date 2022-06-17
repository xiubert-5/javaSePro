package d6_abstract;

public class  Dog extends Animal {

    public String name = "子类狗";

    @Override
    public void run() {
        System.out.println("狗在跑的飞快");
    }
}
