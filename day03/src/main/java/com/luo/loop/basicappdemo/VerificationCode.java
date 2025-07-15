package com.luo.loop.basicappdemo;

public class VerificationCode {
    public static void main(String[] args) {

        getCode();
    }
    // 开发一个程序，可以随机生成4位验证码，验证码由大小写字母和数字构成
    public static void getCode()
        {
            java.util.Random random = new java.util.Random();
            String code = "";

                int number = random.nextInt(10);
                code += number;
                code += (char)(random.nextInt(26) + 'a');
                code += (char)(random.nextInt(26) + 'A');
                code += (char)(random.nextInt(10) + '0');




            System.out.println(code);
        }
}
