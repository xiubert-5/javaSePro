package d9_lambda;

public class LanmbdaDemo1 {
    public static void main(String[] args) {
        //目标：学会使用Lambda的标准格式简化匿名内部类的代码形式
        //注意：Lambda表达式只能简化函数式接口的匿名内部类的写法形式
        //Swimming s1 = new Swimming() {
        //    @Override
        //    public void swim() {
        //        System.out.println("甲贺忍蛙游泳很快~~~");
        //    }
        //};

        //Swimming s1 = () -> {
        //        System.out.println("甲贺忍蛙游泳很快~~~");
        //};

        go(() -> {
            System.out.println("甲贺忍蛙游泳很快~~~");
        });



    }
    public static void go(Swimming s){
        System.out.println("开始-----");
        s.swim();
        System.out.println("结束-----");
    }
}

//一旦加上这个注释必须是函数式接口，里面只能有一个抽象方法
@FunctionalInterface
interface Swimming {
    void swim();
}
