package com.luo.lambda;

public class LambdaDemo1 {
    //认识函数式编程
    public static void main(String[] args) {
        //目标：理解lambda表达式，了解java中的函数式编程
        MyInterface my=new MyInterface() {
            @Override
            public void show() {
                System.out.println("内部类");

            }
        };
        my.show();
        //lambda表达式不能简化全部的内部类，只能简化函数式接口的内部类，函数式接口：只有一个抽象方法的接口
        MyInterface my2=()->{
            System.out.println("lambda表达式简化内部类");
        };
        my2.show();

    }
}

//lambda表达式不能简化全部的内部类，只能简化函数式接口的内部类，函数式接口：只有一个抽象方法的接口
interface MyInterface{
    void show();
}
