package extendsdemo3;

public class Test1 {
    public static void main(String[] args) {
        /*目标：理解继承的特点
        * 1.子类不能继承父类的继承器
        * 2.子类是否可以继承父类的私有成员 可以继承但是不能直接调用
        * 3.子类是否可以继承父类的静态成员 共享 可以直接使用
        * java 只支持单继承 不支持多继承
        * 支持多层继承
        * Object类是祖宗类*/

        Tiger tiger = new Tiger();
        System.out.println(tiger.Location);
    }

}
    class Animal{
       private void eat(){
            System.out.println("动物要吃东西~~");
        }

        public static String Location = "新余图书馆";

    }

    class Tiger extends Animal{

    }

