package com.luo.singleinstance;
// 单例设计模式
// 饿汉式单例
//特点：饿汉式单例，类加载时创建对象，线程安全，但效率不高，获取对象时，对象已经创建好了
//用在Windows任务管理器窗口只能打开一个
public class A {
    // 1. 构造器私有化:确保单例类对外不能创建更多变量，单例才有可能性
    private A(){}
    // 2. 创建一个静态的成员变量，用于基本类的唯一一个对象
    private static A a =new A();//可以加个final修饰
    // 3. 提供一个静态的public方法，返回A对象
    //如果不使用final，提供一个静态方法，返回这个类的唯一对象
    public static A getInstance(){
return a;
    }
}
