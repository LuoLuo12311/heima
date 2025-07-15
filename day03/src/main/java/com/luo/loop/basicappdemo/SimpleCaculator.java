package com.luo.loop.basicappdemo;

public class SimpleCaculator {
    public static void main(String[] args) {

        demo1();
    }
    // 计算器
    public static void demo1() {
        //用户输入两个数字，进行加减乘除运算
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入第一个数字：");
        double a = sc.nextDouble();
        System.out.println("请输入第二个数字：");
        double b = sc.nextDouble();
        System.out.println("请输入运算符号（+-*/）：");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.print("a + b = ");
                System.out.println(a + b);
                break;
            case '-':
                System.out.print("a - b = ");
                System.out.println(a - b);
                break;
            case '*':
                System.out.print("a * b = ");
                System.out.println(a * b);
                break;
            case '/':
                System.out.print("a / b = ");
                System.out.println(a / b);
                break;
            default:

                System.out.println("输入的运算符号有误！");
        }
    }
}
