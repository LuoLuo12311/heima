package com.luo.loop;

public class BreakAndContinueDemo {
    public static void main(String[] args) {

        demo1();
        demo2();
    }
    //理解break和continue的作用
    public static void demo1() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;//跳出循环并结束循环
            }
            System.out.println(i);
        }
    }
    public static void demo2() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;//跳过本次循环，继续下一次循环
            }
            System.out.println(i);
        }
    }
}
