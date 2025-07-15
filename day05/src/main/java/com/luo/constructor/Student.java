package com.luo.constructor;

public class Student {
    //目标：理解构造器了解其特点和常见应用场景
    //一种特殊的方法，不能写返回值类型，名称必须是类名
    //构造器可以重载
    String name;
    int age;
    // 无参构造器
    public Student (){System.out.println("无参构造器");}
    //有参数的构造器
    public Student (String name){
        this.name=name;
        System.out.println( "有参构造器");
    }
    public Student (String name,int age){

        this.name=name;
        this.age=age;
        System.out.println( "有参构造器");
    }

}
