package d8_sort_binarysearch;

import java.util.Arrays;

//选择排序
public class Test1 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {13,4,23,10,88,1024,15,16};

        //2.定义一个循环控制选择几轮：arr.lenth -1
        for (int i = 0; i < arr.length - 1; i++) {

            //3.定义内部循环
            for (int j = i + 1; j <arr.length ; j++) {

                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
