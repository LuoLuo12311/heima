package com.luo.abstractdemo;

public class AbstractDemo1 {
    public static void main(String[] args) {
        //目标：认清抽象类抽象方法，搞清他们的特点
        //抽象类的核心特点
        //得到了抽象方法的能力失去了创建对象的能力
        //抽象类不能创建对象(重点)
        //抽象类的核心意义就是作为父类被子类继承
        //A a = new A();//报错

        //一个类继承抽象类，必须实现父类抽象类的全部抽象方法，否者这个类就也必须成为抽象类
        //B是抽象类A的子类可以正常创建对象
        B b = new B();
        A a = new B();

    }

}
