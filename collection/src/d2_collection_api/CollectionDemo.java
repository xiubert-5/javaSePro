package d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        //1.添加元素
        Collection<String> list = new ArrayList<>();

        list.add("甲贺忍蛙");
        list.add("Html");
        list.add("HTML");
        list.add("JAVA");
        System.out.println(list);

        //2.清空集合的元素
        //list.clear();
        //System.out.println(list);

        //3.判断集合是否为空，是空返回ture，反之
        System.out.println(list.isEmpty());

        //4.获取集合的大小
        System.out.println(list.size());

        //5.判断集合中是否包含某个元素。
        System.out.println(list.contains("JAVA"));
        System.out.println("HTML");

        //6.删除某个元素
        System.out.println(list.remove("Html"));
        System.out.println(list);

        //7.把集合转换成数组
        Object[] arrs = list.toArray();
        System.out.println("数组：" + Arrays.toString(arrs));

        System.out.println("--------------------");

        Collection<String> c1 = new ArrayList<>();
        c1.add("java");
        c1.add("Sping");

        Collection<String> c2 = new ArrayList<>();
        c2.add("hadoop");
        c2.add("Hive");

        //addAll把c2集合的元素全部加入c1中去
        c1.addAll(c2);
        System.out.println(c1);
    }
}
