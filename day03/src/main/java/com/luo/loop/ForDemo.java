package com.luo.loop;

public class ForDemo {
    public static void main(String[] args) {

        test1();
        test2();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入：");
        int n = sc.nextInt();
        test3(n);

    }
    //for循环的书写搞清执行流程
    public static void test1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
    //快捷键fori回车直接得到基本循环
    //求1到5的累积和
    public static void test2() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("1到5的累积和 = " + sum);
    }
//求奇数和
    public static void test3(int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2==1){
                System.out.println(i);
                sum+=i;
            }


        }
        System.out.println("奇数和为："+sum);
    }
}
