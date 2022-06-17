package d5_genericity_class;

public class GenericDemo {
    public static void main(String[] args) {
        String[] names = {"小璐","蓉容","小何"};

        Integer[] ages = {10,20,30};
    }

    public static <T> void printArray(T[] arr){
        if (arr != null){
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0;i < arr.length;i++){
                sb.append(arr[i]).append(i==arr.length-1 ? "" : ",");
            }
            sb.append("]");
            System.out.println(sb);
        }else {
            System.out.println(arr);
        }
    }
}
