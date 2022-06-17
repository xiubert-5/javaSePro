package d12_interface_extends;

public class Test {
    public static void main(String[] args) {
    //    目标：理解接口多继承的作用

        BasketBallMan kobe = new BasketBallMan("kobe","24");
        kobe.competition();
        kobe.drink();
        kobe.eat();
        kobe.law();
        kobe.run();
        System.out.println(kobe.getName().equals("james"));
        System.out.println(kobe.getName().equals("kobe"));


    }
}
