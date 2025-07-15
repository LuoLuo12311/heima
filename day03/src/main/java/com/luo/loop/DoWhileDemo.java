package com.luo.loop;

public class DoWhileDemo {
    public static void main(String[] args) {

        demo1();
    }
    public static void demo1() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("请输入：");
        int a = sc.nextInt();
        do {
            System.out.println(a);
            a++;
        } while (a <= 5);
    }
    // do...while循环的特点：至少执行一次，先执行后判断
    //死循环的三种形式
    public static void demo2() {
        while (true) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("请输入：");
            String line = sc.nextLine();
            System.out.println(  line);
            if ("exit".equals(line)) {
                break;
            }
        }

        do {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("请输入：");
            String line = sc.nextLine();
            System.out.println("hello world");
            if ("exit".equals(line)) {
                break;
            }
        } while (true);
        for (;;) {
            System.out.println("hello world");
        }
    }
}
