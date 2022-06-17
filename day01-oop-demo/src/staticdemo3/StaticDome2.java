package staticdemo3;

public class StaticDome2 {
 /*实例代码块*/

    {
        System.out.println("===实例方法被触发===");

    }

    public static void main(String[] args) {
        StaticDome2 code = new StaticDome2();
        System.out.println(code);
    }
}
