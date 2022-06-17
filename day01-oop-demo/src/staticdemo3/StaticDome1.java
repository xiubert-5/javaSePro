package staticdemo3;

public class StaticDome1 {
    //静态代码块：有static修饰，属于类，与类一起优先加载一次，自动触发执行
    static {
        System.out.println("---------静态代码块被触发执行-----------");

    }
}
