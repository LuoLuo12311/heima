package com.luo.extends4override;

public class Test2 {
    public static void main(String[] args) {
        //目标：方法重写的应用场景，子类重写object类中的toString方法，以便返回对象的内容

        Student s = new Student("小王",18,'男');
        System.out.println(s);//输出：com.luo.extends4override.Student@1b6d3586
        //直接输出对象 默认调用object类中的toString方法,返回对象的地址信息
        //打印的是地址
        //开发中输出地址一般不会用
        //所以需要重写toString方法，以便以后输出对象默认或者就近调用toString方法，返回对象内容
    }

}
class Student{

    private String name;
    private int age;
    private char sex;
    public Student(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student() {
    }

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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "姓名："+name+"，年龄："+age+"，性别："+sex;
        //return super.toString();
    }//ideal官方提供快捷重写toString方法
}
