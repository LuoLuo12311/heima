package com.luo.innerclass;

public class InnerClassDemo1 {
    //目标：掌握内部类

    //成员内部类创建对象格式
    //外部类名.内部类名 对象名 = new 外部类名.内部类名();
    //成员内部类访问外部类成员的特点
    //成员内部类可以访问外部类的静态成员,也可以直接访问外部类的实例成员

    //成员内部类的实例方法中可以直接拿到当前寄生的外部类对象，外部类名.this
    public static void main(String[] args) {

        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }

}
