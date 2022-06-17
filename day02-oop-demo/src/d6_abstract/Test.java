package d6_abstract;

public class Test {
    public static void main(String[] args) {

        //多态
        Animal a = new Dog();
        a.run();
        System.out.println(a.name);
    }
}
