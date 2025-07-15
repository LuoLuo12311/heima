package com.luo.loop;

public class ForWhileDemo {
    public static void main(String[] args) {

        demo1();
        demo2();
    }
    //嵌套循环，搞清嵌套循环的执行流程
    public static void demo1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");//不换行打印一个*
            }
            System.out.println();//换行
        }
    }
    //循环嵌套案例九九乘法表
    public static void demo2() {
        //定义循环打印行
        for (int i = 1; i <= 9; i++) {
            //定义循环打印列
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");//不换行打印
                //"/t"制表符
            }
            System.out.println();//换行
        }
    }
}
