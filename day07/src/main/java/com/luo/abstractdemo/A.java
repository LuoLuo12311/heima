package com.luo.abstractdemo;
//抽象类
//抽象类的核心特点
//得到了抽象方法的能力失去了创建对象的能力
//抽象类不能创建对象(重点)

public  abstract class  A {
    private int a;
    //抽象方法
    // 抽象方法没有方法体只有方法名，使用abstract修饰
    //抽象类中不一定有抽象方法，有抽象方法的类必须是抽象类

    public abstract void show();
}
