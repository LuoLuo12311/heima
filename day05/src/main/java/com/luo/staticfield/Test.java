package com.luo.staticfield;
//static修饰成员变量也可以修饰成员方法
public class Test {
    //目标：static修饰成员变量
    public static void main(String[] args) {

        Student.age=18;
        //通过类名访问静态变量（推荐）
        System.out.println(Student.age);
        //通过对象访问静态变量(不推荐)
        System.out.println(new Student().age);
    }
}
