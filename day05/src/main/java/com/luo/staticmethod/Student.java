package com.luo.staticmethod;
//如果这个方法不需要直接访问对象属性，那么这个方法就可以声明为静态方法
//如果需要访问对象属性，那么这个方法就不应该声明为静态方法，属于对象的行为
public class Student {
    public static  void printStudent(){
        System.out.println("printStudent()");
    }
    public void printStudentMessge(){

    }
}
