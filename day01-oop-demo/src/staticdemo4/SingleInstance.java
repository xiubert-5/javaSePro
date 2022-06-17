package staticdemo4;

import java.util.ArrayList;

public class SingleInstance {
//    使用饿汉单例实现单例类
//    获取对象前，对象已经准备好
    public static SingleInstance instance = new SingleInstance();

    private SingleInstance(){

    }
}
