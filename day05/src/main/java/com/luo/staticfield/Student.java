package com.luo.staticfield;

public class Student {
    //静态变量，属于类只加载一份可以被类和类的全部对象共享访问
    static int age;
    //实例变量，没有static修饰，属于对象，对象实例化时加载
    String name;
    //静态变量的应用场景
    //1.如果某个数据只需要一份，且希望能被共享与访问修改
    //例如：应用启动后，要求用户类可以记住自己创建了多少个对象，那么这个数据就可以用静态变量保存
}
