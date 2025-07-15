package com.luo.interfacedemo2;

public class Test {
    public static void main(String[] args) {
        //目标:理解接口的好处
        //1.弥补了类单继承的不足，一个类可以实现多个接口，使类的角色更多，功能更强大
        //2.让程序可以面向接口编程，这样程序员就可以灵活方便的切换各种业务实现（更利于程序的解耦合

        //继承实现后既可以当老师又可以当司机又可以当朋友
        com.luo.interfacedemo3.Student s = new com.luo.interfacedemo3.Student();
        Friend t = new Student();

        Driver driver=new Student();



        //2.让程序可以面向接口编程，这样程序员就可以灵活方便的切换各种业务实现（更利于程序的解耦合

        Driver d1 = new Boy();


    }

}
interface Driver{}
interface Friend {}
class Teacher{}
class Student extends Teacher implements Friend, Driver{}
class Boy implements  Friend, Driver{}