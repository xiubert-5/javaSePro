package d13_interface_jdk8;

public interface SportManInter {
    //不需要构造器和getter和setter
    public static final String name = "奇怪的上单";
    /*
     * 1.JDK 8 开发：默认方法
     * --必须default修饰，默认public修饰
     * --默认方法，接口不能创建对象，这个方法只能过继给了实现类，由实现类的对象调用*/
    default void run() {
        System.out.println("跑的很快");
        go();
    }
    /*
    * 2.静态方法
    * 必须使用static修饰，默认用public修饰
    * --接口的静态方法，必须接口名自己调用*/
    static void inAddr(){
        System.out.println("每天多学一点 加油");

    }
    /*
    * 3.私有方法
    * --JDK 1.9开始才支持的
    * -- 必须在接口内部才能访问*/
    private void go(){
        System.out.println("开始跑~~~");
    }
}

class PingPongMan implements SportManInter{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PingPongMan(String name) {
        this.name = name;
    }
}

class Test{
    public static void main(String[] args) {
        PingPongMan s = new PingPongMan("马龙");
        s.run();
        SportManInter.inAddr();

    }
}