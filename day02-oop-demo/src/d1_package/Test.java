package d1_package;

import d1_package.it.Student;

public class Test {
    public static void main(String[] args) {
        //目标：理解以下两点
        //1.同一个包下的类，互相可以直接访问
        System.out.println(User.onLineNumber);
        //2.不同包下的类，必须先导包才可以访问
        Student s = new Student();
        System.out.println(s.name);

        //3.如果这个类中使用不同包下的相同的类名，此时默认只能导入一个类的包，另一个类要使用全名访问
        d1_package.it2.Student s2 = new d1_package.it2.Student();

    }
}
