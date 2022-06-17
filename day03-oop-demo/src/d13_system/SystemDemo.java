package d13_system;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("程序开始~~~");
        //JVM终止
        //System.exit(0);

        //    计算机认为时间有起源:返回1970-1-1 00.00.00 走到此刻的总的毫秒值,时间毫秒值
        Long time = System.currentTimeMillis();
        System.out.println(time);
        //进行时间的计算:性能分析
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("输出:" + i);
        }
        long endTime = System.currentTimeMillis();

        double number = (endTime - startTime) / 1000;
        System.out.println(number + "s");


        //数组拷贝
        /*参数一:被拷贝的数组
        * 参数二:从哪个索引位置开始拷贝
        * 参数三:复制的目标数组
        * 参数四:粘贴位置
        * 参数五:拷贝元素的个数*/
        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = new int[6];
        System.arraycopy(arr1,2,arr2,3,4);


        System.out.println("程序结束~~~");
    }
}
