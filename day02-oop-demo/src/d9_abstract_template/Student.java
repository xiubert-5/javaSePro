package d9_abstract_template;

public abstract class Student {
    public final void run(){
        System.out.println("今天有体育课期末考试");
        System.out.println("体育课期末考试的内容是");
        System.out.println(runRace());
        System.out.println("请同学们做好热身，准备考试");
    }

    public abstract String runRace();
}
