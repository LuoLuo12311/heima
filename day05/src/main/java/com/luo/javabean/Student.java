package com.luo.javabean;
//实体类
public class Student {
    //实体类的特征
    //1.私有成员变量
    private String name;
    private int age;
    private int chinese;
    private int math;
    //提供一个有参构造器(可选)
    public Student(String name,int age){}
    //提供无参构造器（必须）

    public Student() {
    }

    //2.公开的getter和setter方法
    //ideal中自动生成getter和setter方法的快捷Generate，通用自动生成的意思
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
