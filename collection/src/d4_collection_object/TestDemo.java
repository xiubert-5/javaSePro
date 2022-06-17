package d4_collection_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;

public class TestDemo {
    public static void main(String[] args) {
        //定义一个电影类
        //定义一个集合对象存储三部电影
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("肖申克的救赎","肖申克","9.3"));
        movies.add(new Movie("拯救大兵瑞恩","瑞恩","8.4"));
        movies.add(new Movie("月光骑士","史蒂文","8.6"));

        //遍历集合容器中的每个电影对象
        //System.out.println("电影名称" + m.getName() + "电影主角是" + m.getActor() + "电影评分是" + m.getScore());

        //movies.forEach( movie -> System.out.println(Arrays.toString()));

        for (Movie m : movies) {
            System.out.println("电影名称" + m.getName());
            System.out.println("电影主角是" + m.getActor());
            System.out.println("电影评分是" + m.getScore());
            System.out.println("--------------------");

        }
    }
}
