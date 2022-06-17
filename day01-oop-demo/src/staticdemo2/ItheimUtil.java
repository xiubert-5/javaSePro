package staticdemo2;

import java.util.Random;

public class ItheimUtil {

    //工具类构造器私有
    private ItheimUtil(){

    }

    public static String creatVerifyCode(int n) {
        //定义一个变量记住验证码
        String code = "";
        //定义一个变量记住全部验证码字符
        String data = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
        //定义一个循环生产出几个随机索引
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            //获取随机的字符，链接给code
            int index = r.nextInt(data.length());
            code += data.charAt(index);

        }
        return code;
    }
}