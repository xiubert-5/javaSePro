package d14_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {


//    包装浮点型数据成为大数据对象 BigDeciaml
//        解决浮点型运算精度失真问题
//        对象获取: BigDecimal b1 = BigDecimal.valueOf(0.1);
        double a = 0.1;
        BigDecimal a1 = BigDecimal.valueOf(a);
        double b = 0.2;
        BigDecimal a2 = BigDecimal.valueOf(b);

        //BigDecimal c1 = a1.add(a2);
        //BigDecimal c1 = a1.subtract(a2);
        BigDecimal c1 = a1.multiply(a2);
        //BigDecimal c1 = a1.divide(a2);
        //System.out.println(c1);

        //    目的:double
        double rs = c1.doubleValue();

        //    注意事项:BigDecimal是一定要精度运算的
        BigDecimal a11 = BigDecimal.valueOf(10.0);
        BigDecimal b11 = BigDecimal.valueOf(3.0);
        //BigDecimal c11 = a11.divide(b11);
        /*参数一:除数 参数二:保留小数位数 参数三:舍入模式*/
        BigDecimal c22 = a11.divide(b11,2,RoundingMode.HALF_UP);
        System.out.println(c22);

        }
        }
