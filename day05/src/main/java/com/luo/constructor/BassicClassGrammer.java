package com.luo.constructor;

public class BassicClassGrammer {
    public static void main(String[] args) {
Student s1=new Student();
Student s2=new Student("小王");
Student s3=new Student("小王",18);
    }
}
//类的成分
//1.构造器
//特点；创建对象时会自动调用构造器
//构造器的作用：初始化对象,创建对象同时为对象赋值
//2.构造器的注意事项
//类默认自带一个无参构造器
//如果一旦为类定义了构造器，那么类默认自带的构造器就会失效
//这时还想使用无参构造器，必须自己创建