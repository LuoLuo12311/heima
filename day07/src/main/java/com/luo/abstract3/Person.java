package com.luo.abstract3;

public  abstract class Person {
//模版方法设计模式
public final void  write()//加final修饰，防止子类重写模版
{
    System.out.println("《我的爸爸》");
    System.out.println("我的爸爸是个好人");
    //模版方法知道子类都要写这第三句话，且知道它们各不相同
    //就定义一个抽象方法由子类重写
    writeMain();
    // System.out.println("学生的爸爸的爸爸");
    System.out.println("爸爸是好爸爸");
}
public  abstract void writeMain();//提供子类重写的抽象方法

}
