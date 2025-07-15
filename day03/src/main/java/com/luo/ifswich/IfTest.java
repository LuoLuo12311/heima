package com.luo.ifswich;

public class IfTest {
    public static void main(String[] args) {
        test1(1);

    }
    //目标：完成汽车自动驾驶程序的模拟，以便可以根据红绿灯状态正确行驶
    public static void test1(int a) {
        //假设摄像头获得了三种灯的状态如下
        int green = 1;
        int yellow = 0;
        int red = 0;


        if (a == green) {
            System.out.println("开灯");
        } else if (a == yellow) {
            System.out.println("等一等");
        } else if (a == red) {
            System.out.println("关灯");
        } else {
            System.out.println("请检查输入");
        }
        System.out.println("程序结束");
    }
}
