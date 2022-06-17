package d9_api_object;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("小智",'男',10);
        Student s2 = new Student("小智",'男',10);
        Student s3 = new Student("小日",'男',10);
        //equals默认是比较2个对象的地址是否相同
        System.out.println(s1.equals(s2));
    }
}
