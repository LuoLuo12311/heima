package com.luo.ifswich;

public class SwitchDemo2 {
    public static void main(String[] args) {
        test1();

    }
    //Switch的注意事项与穿透性应用·
    //1.switch的参数只能是byte,short,char,int,jdk5开始支持枚举,jdk7开始支持String
    //不支持float,double,boolean,long
    //2.switch的case的值只能是字面量，不能是变量，case的值不能重复
    //3.正常使用switch时，不要忘记 break，否则会出现穿透现象，默认穿透到下一个case
    public static void test1() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入：");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("没有匹配的");
        }
    }
}
