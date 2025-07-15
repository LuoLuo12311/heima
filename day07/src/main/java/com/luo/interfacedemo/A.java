package com.luo.interfacedemo;
//接口使用interface关键字
public interface A {
    //在jdk8之前，接口中只能有抽象方法和常量（成员变量）
    //接口中定义常量可以省略 public static final不写，默认会加上
    String SCHOOL_NAME="张三";
    //public static final String SCHOOL_NAME2="张三";
    //抽象方法
    //接口中定义抽象方法可以省略public abstract 不写，默认会加上
    //抽象类中不能省略public abstract，接口中的方法都是公开的
    void show();
   public   abstract void show2();
}
