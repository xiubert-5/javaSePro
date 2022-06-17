package d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //增强for 可以遍历集合也可以遍历数组
        Collection<String> lists = new ArrayList<>();
        lists.add("小甲");
        lists.add("小贺");
        lists.add("小忍");
        lists.add("小蛙");
        System.out.println(lists);

        for (String ls : lists){
            System.out.println(ls);
        }

        System.out.println("----------------");

        double[] arr = {100,123,22.3,2323.4};
        for (double score : arr) {
            System.out.println(score);

        }


    }
}
