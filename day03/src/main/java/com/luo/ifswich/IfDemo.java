package com.luo.ifswich;

public class IfDemo {
    public static void main(String[] args) {
java.util.Scanner sc = new java.util.Scanner(System.in);

        int a=1;
        do {
          System.out.println("请输入：");
          a = sc.nextInt();
          test1(a);} while (a > 0);


    }
    //认识if语句
    //if语句中如果只有一个条件，那么可以省略{}
    public static void test1(int a){

        if(a > 5){
            System.out.println("a大于5");
        }
        else {System.out.println("a小于5");}
        System.out.println("程序结束");
        System.out.println("--------------------------------");
    }
}
