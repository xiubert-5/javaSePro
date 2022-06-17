package d9_abstract_template;

public class Test {
    public static void main(String[] args) {
    //    目标：理解模板方法模式的思想和使用步骤
    //    模板方法建议使用final修饰，更加专业
    //    模板方法是给子类直接使用的，不是让子类重写的，一旦子类重写了模板方法，则模板方法就失效了
    //    因此，加上final后可以防止子类重写模板方法，这样更安全，专业


    //    模板方法模式
    //    提高了代码的复用性
    //    不能确定的部分定义成抽象方法，交给子类使用

        StudentMiddle s = new StudentMiddle();
        s.run();
        System.out.println("-----------------------");
        StudentChild ss = new StudentChild();
        ss.run();


    }
}
