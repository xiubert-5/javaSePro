package d1_polymorphic;

public class Tortoise extends Animal {
    public String name = "子类龟";
    @Override
    public void run() {
        System.out.println("🐢跑的贼慢~~");
    }
}
