package com.luo.extends3feature;

public class Test {
    public static void main(String[] args) {
        //目标：继承的注意事项，继承的特点

        Zi z=new Zi();
        z.show();

    }
}
//为了便于观察将几个类写在同一个文件中
//但是实际开发中，一个文件一个类
//特点1：单继承，java中的类只能有一个直接父类，不支持多继承，但支持多层继承，父类可以拥有子类孙类
//多继承可能出现二义性，两个父类中的同名方法出现歧义
class A{}
class B extends A{}
class C extends B{}
//2.java中的组种类是Object，java中所有的类都继承Object类，要么直接继承，要么默认继承，要么间接继承
//3.继承后子类访问成员的特点：就近原则
//先在子类局部范围中找，再在子类成员范围中找，找不到再找父类成员范围都找不到再报错
//如果想在子父类中出现了同名成员会优先使用子类成员，如果此时一定要在子类中访问父类的同名成员
//可以使用super关键字访问
//super.父类成员变量/父类成员方法
class Fu{String name="funame";}
class Zi extends Fu{
    String name="ziname";
    public void show(){
       String name="jubuname";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
