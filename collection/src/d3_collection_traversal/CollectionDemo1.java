package d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("小甲");
        lists.add("小贺");
        lists.add("小忍");
        lists.add("小蛙");
        System.out.println(lists);

        //1.得到当前集合的迭代器对象
        Iterator<String> it = lists.iterator();
        //String ls = it.next();
        //System.out.println(ls);

        //2.定义whil循环
        while (it.hasNext()){
            String ele = it.next();
            System.out.print(ele);
        }
    }
}
