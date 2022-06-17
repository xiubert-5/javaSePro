package d5_genericity_class;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("java");
        list.add("MySQL");
        System.out.println(list);

        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(33);
        System.out.println(list1);
    }
}
