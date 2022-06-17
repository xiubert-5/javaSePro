package d7_innerclass_anonymous;

/*目标：掌握匿名内部类的使用形式（语法）*/
public class Test3 {
    public static void main(String[] args) {

        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生在自由泳，游的一般");
            }
        };

        Swimming s2 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师在蛙泳，游的很快");
            }
        };

        Swimming s3 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("运动员在自由泳，在水里飞起来了");
            }
        };

       go(s1);
       go(s2);
       go(s3);
    }

    /*学生 老师 运动员 可以一起参加比赛*/
    public static void go(Swimming s){
        System.out.println("-------------------");
        System.out.println("开始游泳比赛");
        s.swim();
        System.out.println("结束游泳比赛");


    }
}

interface Swimming{
    void swim();
}
