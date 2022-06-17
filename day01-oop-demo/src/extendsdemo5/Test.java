package extendsdemo5;

public class Test {
    public static void main(String[] args) {
    //    目标：认识方法重写
        NewPhone xm = new NewPhone();
        xm.call();
        xm.sendMsg();

    }
}

/**
 * 新手机
 */
class NewPhone extends Phone{

    @Override //重写校验注解，加上以后，这个方法必须是正确重写的，更加安全
    //提高程序的可读性，方便阅读
    public void call(){
        super.call();
        System.out.println("开始视频通话~~");
    }

    @Override
    public void  sendMsg(){
        super.sendMsg();
        System.out.println("发短信");

    }
}




/**
 * 旧手机
 */
class Phone{
    public void call(){
        System.out.println("打电话~");
    }

    public void sendMsg(){
        System.out.println("发短信~");
    }
}