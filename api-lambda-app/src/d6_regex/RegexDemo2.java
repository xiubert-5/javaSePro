package d6_regex;

import java.util.Scanner;

public class RegexDemo2 {
    //目标： 校验 手机号码 邮箱 电话号码
    public static void main(String[] args) {

    }

    public static void checkTel(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请您输入您的电话号码");
            String phone = sc.next();

            if ( phone.matches("0\\d{2,6}-?\\d{5,20}")){
                System.out.println("电话格式正确，注册完成");
                break;
            }else {
                System.out.println("格式有误");
            }
        }
    }

    public static void checkEmail(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请您输入您的注册邮箱");
            String phone = sc.next();

            if ( phone.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}\\.([a-zA-Z0-9]{2,20}){1,2}")){
                System.out.println("邮箱格式正确，注册完成");
                break;
            }else {
                System.out.println("格式有误");
            }
        }
    }


    public static void checkPhone(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请您输入您的注册手机");
            String phone = sc.next();

            if ( phone.matches("1[3-9]\\d{11}")){
                System.out.println("手机号码格式正确，注册完成");
               break;
            }else {
                System.out.println("格式有误");
            }
        }
    }
}
