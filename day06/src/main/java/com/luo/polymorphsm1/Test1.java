package com.luo.polymorphsm1;
//多态的前提：1继承实现关系,2存在父类引用子类对象，3子类实现存在方法重写
//多态是对象的多态，是行为的多态，java中的属性成员变量不谈多态
public class Test1 {
    public static void main(String[] args) {
        //目标;认识多态，面向对象的三大特征之一
        //对象多态，小范围直接交给大范围
        Animal a = new Wolf();

        Animal b = new Tortoise();//2存在父类引用子类对象
        //行为多态
        a.run();
        b.run();//编译看左边，运行看右边
        //对于成员变量编译看左边，运行也看左边
        //成员变量不强调多态性
        System.out.println(a.name);
        System.out.println(b.name);

    }
}
