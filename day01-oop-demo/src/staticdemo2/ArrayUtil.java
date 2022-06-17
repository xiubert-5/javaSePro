package staticdemo2;

public class ArrayUtil {

    //私有构造器
    private ArrayUtil(){

    }

    public static String toString(int[] arr){
        //校验
        if (arr == null){
            return null;
        }

        //拼接内容并返回
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += (i == arr.length - 1 ? arr[i] : arr[i] + ",");

        }
        result += "]";
        return result;

    }
}
