package com.luo.extends1demo;

public class Test {
    public static void main(String[] args) {
        //目标：认识继承
        //创建老师对象
        //子类可以继承父类的非私有成员
        //子类对象其实是由子类父类多张设计图共同创建的，所以子类对象是完整的
        Teacher t1 = new Teacher();
        t1.setName("小王");
        t1.setAge(18);
        t1.setSex("男");
        t1.setSkill("Java后端");
        System.out.println(t1.getName() + " " + t1.getAge() + " " + t1.getSex() + " " + t1.getSkill());
    }
}
