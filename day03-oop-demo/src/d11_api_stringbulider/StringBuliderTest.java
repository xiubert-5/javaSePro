package d11_api_stringbulider;

public class StringBuliderTest {
    public static void main(String[] args) {

    }

    /*定义方法接受任意整形数组，返回数组内容格式*/
    public static String toString(int[] arr){
        if (arr != null){
            //    开始拼接内容
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i ==arr.length-1 ? "" : ",");

            }
            sb.append("]");
            return sb.toString();
        }else {
            return null;
        }

    }
}
