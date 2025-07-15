package com.luo.finaldemo;

public class FinalDemo1 {
    //成员变量
    //final 修饰静态成员变量，这个变量之后被称为常量，可以记住一个固定值，并且程序中不能修改，通常称这个值为系统配置信息
    //关于常量的命名，建议全部单词大写，多个单词间用下划线_连接
    public static final int AGE = 18;
    //final修饰实例成员变量一般没有意义
    public final String name= "luiokiayuan";
    public static void main(String[] args) {

        //目标：认识final关键字的作用

        //1.final修饰变量，有且仅能被赋值 一次，防止别人修改，恶意修改
        /*
        变量有哪些*/
        //1.成员变量（写在类中）
              /*静态成员变量
              实例成员变量*/
        //2.局部变量（写在方法中）
        final int age = 18;
       // age=19;第二次赋值会报错



        //final修饰引用类型的引用变量，引用变量的地址值不能被修改，但是引用变量所引用的对象的内容可以修改
        final String[] name = {"luo"};
        name[0] = "luo1";

    }
}
//1.final修饰类，不能被继承，用在工具类中，可以用final修饰
 final class A{

}
/*class B extends A{
报错无法继承
}*/

//2.final修饰方法，不能被重写
class C{
    public final void show(){

        System.out.println("show方法");
    }
}
class D extends C{
    /* @Override
    public void show(){
        //报错show方法无法被重写
    }*/
}
