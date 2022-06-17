package d6_regex;

public class RegexDemo1 {
    public static void main(String[] args) {

        /*String类的哪个方法可以与正则表达式进行匹配
        * matches（String regex）*/
        //需求：校验qq号，必须全部数字 6-20位
        System.out.println(checkQQ("1040372898"));
        System.out.println(checkQQ1("1040372898"));
    }


    public static boolean checkQQ1(String qq) {
        return qq !=  null && qq.matches("\\d{6,20}");

    }

    public static boolean checkQQ(String qq) {
        //1.判断qq号码的长度是否满足要求
        if (qq == null || qq.length() < 6 || qq.length() > 20) {
            return false;
        }

        //2.判断qq中是否全部是数字，不是返回false
        //1040372898
        for (int i = 0; i < qq.length(); i++) {
            //获取每位字符
            char q = qq.charAt(i);
            if (q < '0' || q > '9') {
                return false;
            }

        }

        return true;
    }
}
