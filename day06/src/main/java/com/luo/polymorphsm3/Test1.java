package com.luo.polymorphsm3;
//强制类型转换可以解决多态状态下无法调用子类特有方法的问题
//先加判断，再强转，instanceof
public class Test1 {
    public static void main(String[] args) {
        //目标;了解多态的下的类型转换问题

        Animal a = new Wolf();

        //大范围转小范围需要强制类型转换
        Wolf a1 = (Wolf) a;//强制类型转换，快捷键ault加回车
        Tortoise b = new Tortoise();

        //强制类型转换的注意事项
        //存在继承/实现关系就可以在编译阶段进行强制类型转换，编译阶段不会报错
        //但是运行时如果对象的真实类型与强制转换后的类型不同，就会报错类型转换异常（ classcastexception）的错误
        //Tortoise b1 = (Tortoise) a;运行时报错
        a.run();
        b.run();

        System.out.println("==============");
        //强转前，java建议使用 instanceof关键字判断当前对象的真实类型，再进行强制类型转换
        if (a instanceof Wolf) {
            Wolf a2 = (Wolf) a;
            a2.eatSheep();
        }
        else if ( a instanceof Tortoise) {
            Tortoise b1 = (Tortoise) a;
            b1.suoTou();
            
        }
        System.out.println(a.name);
        System.out.println(b.name);
        show(a);
        show(b);

        a1.eatSheep();

        b.suoTou();
    }
    public static void show(Animal a){
        //解决方法，先判断当前对象是什么类型

        if (a instanceof Wolf) {
            Wolf a2 = (Wolf) a;
        }
        else if ( a instanceof Tortoise) {
            Tortoise b1 = (Tortoise) a;
            b1.suoTou();
        }
        a.run();
        System.out.println("在跑");

    }
}
