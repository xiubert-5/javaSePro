package d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    //集合支持泛型，集合和泛型不支持基本类型，只支持引用数据类型

    /*集合类体系结构
     * Collection单列
     * 每个元素（数据）只包含一个值
     * Map双列
     * 每个元素包含两个值*/

    /*Collection
     * 有List 和 Set 两个子集合
     * List集合特点：添加的元素式有序，可重复，有索引
     * ArrayList，LinekdList ：有序，可重复，有索引
     *
     * Set系列集合：添加的元素式无序，不重复，无索引
     * HashSet：无序，不重复，无索引
     * LinkedHashSet：有序，不重复，无索引
     * TreeSet：按照大小默认升序排序，不重复，无索引*/
    public static void main(String[] args) {
        //有序，可重复，有索引
        Collection list = new ArrayList();
        list.add(1);
        list.add(231);
        list.add("asdsa");
        list.add(false);
        list.add(true);
        list.add("12321");
        list.add("rerr");
        System.out.println(list);

        //无序，不重复，无索引
        Collection list1 = new HashSet();
        list1.add(1);
        list1.add(231);
        list1.add("asdsa");
        list1.add(false);
        list1.add(true);
        list1.add("12321");
        list1.add("rerr");
        System.out.println(list1);
    }
}
