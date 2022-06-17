package d11_api_stringbulider;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        /*目标
         * 学会使用StringBulider操作字符串，最终还需要知道它性能好的原因
         * 支持链式编程*/
        StringBuilder sb = new StringBuilder();
        sb.append(123).append(123213).append("yq123");
        System.out.println(sb);

        //    反转
        sb.reverse().append("123").reverse();
        System.out.println(sb);

        /*注意：stringBuilder只是拼接字符串的手段：效率好
        * 最终的目的还是要回复成String类型*/
        StringBuilder sb1 = new StringBuilder();
        sb1.append("yq123").append("xw123");
    //    恢复成String类型
        String s1 = sb1.toString();
        System.out.println(s1);
    }

}
