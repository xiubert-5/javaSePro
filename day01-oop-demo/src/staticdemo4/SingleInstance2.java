package staticdemo4;

public class SingleInstance2 {

    private String name;
    private String password;
    private String ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    //    私有构造器
    private SingleInstance2() {

    }
    //定义一个静态的成员变量负责存储一个对象
    //只加载一次，只有一份

    private static SingleInstance2 instance;

    /*提供一个方法，对外返回单例对象*/
    public static SingleInstance2 getInstance() {
        if (instance == null) {
            instance = new SingleInstance2();

        }
        return instance;
    }
}
