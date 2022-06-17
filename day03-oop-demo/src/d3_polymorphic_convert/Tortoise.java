package d3_polymorphic_convert;

public class Tortoise extends Animal {
    public String name = "子类龟";
    @Override
    public void run() {
        System.out.println("🐢跑的贼慢~~");
    }

    public void defend(){
        System.out.println("乌龟躲进了龟壳里");
    }
}
