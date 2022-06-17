package d9_api_object;

/*目标：掌握Object中toString方法的使用*/
public class Test1 {
    public static void main(String[] args) {
        Student s = new Student("周润",'男',20);
        String rs = s.toString();
        System.out.println(rs);
    }
}
