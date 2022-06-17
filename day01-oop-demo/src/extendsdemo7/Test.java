package extendsdemo7;

public class Test {
    public static void main(String[] args) {
    //    目标：学习子类构造器如何去访问父类有参数构造器，还要清楚其作用。
        Teacher t = new Teacher();
        t.setName("小杨");
        Teacher s = new Teacher("小羊",20);
    }
}
