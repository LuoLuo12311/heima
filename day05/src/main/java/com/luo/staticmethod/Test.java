package com.luo.staticmethod;

public class Test {
    //目标认识static修饰的静态方法和实例方法
    //main 方法属于静态方法用类名调用
    public static void main(String[] args) {
Student s1=new Student();

        //推荐使用类名调用静态方法
        Student.printStudent();
        Student student=new Student();
        student.printStudentMessge();
        Student.printStudent();
        //如果这个方法不需要直接访问对象属性，那么这个方法就可以声明为静态方法
    }
}
