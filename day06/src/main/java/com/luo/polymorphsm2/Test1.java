package com.luo.polymorphsm2;


public class Test1 {
    public static void main(String[] args) {
        //目标;了解多态的好处
        //1.右边的对象是解耦合的更易于拓展和维护，如wolf和tortoise
        Animal a = new Wolf();

        //好处2.定义方法时使用父类形参，可以接受一切子类对象扩展性更强，更便利

        Tortoise b = new Tortoise();//2存在父类引用子类对象
        //行为多态
        a.run();
        b.run();//编译看左边，运行看右边

        System.out.println(a.name);
        System.out.println(b.name);
        show(a);
        show(b);
        //多态状态下存在的问题，没法调子类存在的独有功能
       // a.eatSheep();报错

        b.suoTou();
    }
    public static void show(Animal a){
        a.run();
        System.out.println("在跑");

    }
}
