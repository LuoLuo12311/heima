package com.luo.loop;

public class WhileDemo {
    public static void main(String[] args) {


        test1();
        test2();
    }
    public static void test1() {
int i=0;
        while(i<=3 ){
            System.out.println("i = " + i);
            i++;
        }
    }
    //知道循环几次用for，不知道循环几次用while
    //while的使用场景
    public static void test2() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("请输入：");
            String line = sc.nextLine();
            if ("exit".equals(line)) {
                break;
            }
        }
    }
    public static void test3() {


    }

}
