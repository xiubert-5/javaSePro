package d4_polymorphic_test;

/*目标：USB设备模拟
* 1.定义USB接口：接入 拔出
* 2.定义2个USB的实现类：鼠标，键盘
* 3.创建一个电脑对象，创建USB设备对象，安装启动
* */
public class Test {
    public static void main(String[] args) {

        Computer c = new Computer("小米电脑pro");
        c.start();
        c.installUSB(new KeyBoard("K835"));
        c.installUSB(new Mouse("g102"));

    }
}
