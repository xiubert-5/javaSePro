package d7_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        //目标：学会使用Arrays类的常用api，并理解其原理
        int[] arr = {13,153,43,42,5,45};
        System.out.println(arr);
        //返回数组内容
        String rs = Arrays.toString(arr);
        System.out.println(rs);

        //2.排序的API（默认自动对数组元素进行升序降序）
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //3.二分搜索技术
        //前提数组必须排好序
        int index = Arrays.binarySearch(arr,153);
        System.out.println(index);

        //返回不存在元素的规律：-（应该插入的位置索引 + 1）
        int index2 = Arrays.binarySearch(arr,20);
        System.out.println(index2);

        //注意：数组如果没有排好序，可能会找不到存在的元素，从而出现bug
        int[] arr2 = {12,32,24,13,23,14,2413,23,29};
        int index3 = Arrays.binarySearch(arr,32);
        System.out.println(index3);

    }
}
