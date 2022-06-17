package extendsdemo2;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
        s.setName("小王");
        s.writeInfo();
        s.queryCourse();
    }
}
