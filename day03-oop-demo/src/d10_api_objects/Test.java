package d10_api_objects;

import java.util.ArrayList;

/*目标：掌握objecs类的常用方法：equals*/
public class Test {
    public static void main(String[] args) {
        String s1 = "yq123";
        String s2 = "yq123";
        System.out.println(s1.equals(s2));

        System.out.println(s1);
        ArrayList s3 = new ArrayList();
        s3.add("yq");
        s3.add("123");
        System.out.println(s3);

    //    isNull
    //    判断变量是否为null，为null返回true
    }

}
