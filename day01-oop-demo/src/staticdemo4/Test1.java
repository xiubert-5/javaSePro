package staticdemo4;

public class Test1 {
    public static void main(String[] args) {
    //    目标：理解饿汉单例的设计步骤
    //    SingleInstance s1 = new SingleInstance();
    //    SingleInstance s2 = new SingleInstance();
    //    SingleInstance s3 = new SingleInstance();

        SingleInstance s1 = SingleInstance.instance;

    }
}
