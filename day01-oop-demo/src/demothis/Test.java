package demothis;

public class Test {
    public static void main(String[] args) {
    //    目标：理解this(...)的作用，本类构造器中访问本类兄弟构造器
        Student s1 = new Student("小杨","清华大学");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());

        Student s2 = new Student("小王");
        System.out.println(s2.getName());
        System.out.println(s2.getSchoolName());
    }
}
