package com.luo.interfacedemo;

public class Test {
    public static void main(String[] args) {
        //目标：掌握接口的用法，基本特点，使用
       System.out.println(A.SCHOOL_NAME);//常量可以直接使用类名调用
        //注意：接口不能创建对象
        //接口是用来被类实现的，实现接口的类被称为实现类，一个类可以实现多个接口

        C a = new C();
        a.show();
        a.show2();
        a.run();

    }
}
//C被称为实现类，C实现了A和B接口，同时实现了多个接口
//实现类实现多个接口，他必须重写玩全部抽象类的全部抽象方法，否则这个类必须定义为抽象类
class C implements A,B{

    @Override
    public void show() {

        System.out.println("C show");
    }

    @Override
    public void show2() {

        System.out.println("C show2");
    }

    @Override
    public void run() {

        System.out.println("C run");
    }
}
