package d6_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
        String names = "甲贺忍蛙dsadsadsald水手里剑ksjdkasjdaskjd";
        String[] arrs = names.split("\\w+");
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }

        //String names2 = names.replaceAll("\\w+")

        //需求：从上面的内容中爬取出 电话号码和邮箱
        //1.定义爬取规则，字符串形式
        String regax = "";

        //2.把这个爬取规则编译成匹配对象
        Pattern pattern = Pattern.compile(regax);

        //3.得到一个内容匹配器对象
        Matcher matcher = pattern.matcher(names);

        //4.开始找了
        while (matcher.find()){
            String rs1 = matcher.group();
            System.out.println(rs1);
        }
    }
}
