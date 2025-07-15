package com.luo.extends2modifier;

public class Test {
    public static void main(String[] args) {
        //目标:认识四种权限修饰符的修饰范围

        //当前包的其它类中访问四种方法
        Father f = new Father();
        f.method();
        f.protectedMethod();
        f.publicMethod();
        //f.privateMethod();//只有private修饰的方法不能当前包中的被其它类访问
    }
}
//在其他包的普通类中只能访问public方法
//在其他包的子类中只能访问public protected方法
//在当前包其他类中只有private方法不能访问

