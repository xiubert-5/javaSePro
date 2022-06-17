package d11_interface_implements;

public class PingPongMan implements SportMan,Low {

    private String name;

    public PingPongMan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "开始了跑步");

    }

    @Override
    public void competition() {
        System.out.println(name + "参加比赛夺得冠军");

    }

    @Override
    public void raw() {
        System.out.println(name + "不偷税不漏税");
    }
}
