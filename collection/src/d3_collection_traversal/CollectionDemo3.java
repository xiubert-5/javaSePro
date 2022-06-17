package d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("小甲");
        lists.add("小贺");
        lists.add("小忍");
        lists.add("小蛙");
        System.out.println(lists);

        lists.forEach(s -> System.out.println(s));


    }
}
