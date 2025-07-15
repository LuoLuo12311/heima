package com.luo.thisdemo;

public class Test {
    //目标认识this关键字
    //搞清楚this关键字的应用场景
    //this关键字主要用来解决变量名称冲突的问题
    public static void main(String[] args) {
        Student s = new Student();
        s.name="小王";
        s.print();//输出当前学生对象的地址
s.likeHabby("小张");
        System.out.println(s);
        System.out.println("===================");
        Student s2=new Student();
        s2.print();
        System.out.println(s2);
    }
}
