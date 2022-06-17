package staticdemo4;

public class Test2 {
    /* 懒汉单例
     * 真正需要对象的时候才会创建对象*/

    public static void main(String[] args) {
        SingleInstance2 s1 = SingleInstance2.getInstance();
        SingleInstance2 s2 = SingleInstance2.getInstance();
        s1.setName("yq");
        s2.setName("wyy");
        s1.setPassword("123456");
        s2.setPassword("12346");

        System.out.println(s1.getName() + " " + s1.getPassword());
    }

}
