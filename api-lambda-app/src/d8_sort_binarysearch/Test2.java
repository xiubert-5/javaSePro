package d8_sort_binarysearch;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        /*目标：理解二分搜索的原理并实现*/
        //1.定义数组
        int[] arr = {1,23,32,44,11,44,23,323,44,3};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, 44));

    }

    /**
     * 二分查找算法的实现
     * @param arr 排序的数组
     * @param data 要找的数据
     * @return 索引，如果元素存在，直接返回-1
     */
    public static int binarySearch(int[] arr,int data){
        //1.定义左边位置 和 右边位置
        int left = 0;
        int right = arr.length-1;

        //2.开始循环，折半查询
        while (left <= right){
            //取中间索引
            int middleIndex = (left + right) / 2;
            //3.判断中间位置元素和所要找的元素大小比较情况
            if (data > arr[middleIndex]){
                left = middleIndex + 1;
            }else if (data < arr[middleIndex]){
                right = middleIndex - 1;
            }else {
                return middleIndex;
            }
        }
        return -1;//查无此元素

    }
}
