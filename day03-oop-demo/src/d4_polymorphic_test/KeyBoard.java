package d4_polymorphic_test;

public class KeyBoard implements USB {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KeyBoard() {
    }

    public KeyBoard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功连接电脑");

    }

    @Override
    public void unconnect() {
        System.out.println(name + "成功从电脑拔出");

    }

    /*独有功能*/
    public void keyDown() {
        System.out.println(name + "敲击了：努力学习");
    }
}
