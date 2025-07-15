package com.luo.abstract3;
//模版方法设计模式
public class Test {
    public static void main(String[] args) {
        //目标：理解抽象类的使用场景之一：模版方法设计模式
        //需求：学生老师都要写一篇作文《我的爸爸》
        //  第一段文字一样: 我的爸爸是个好人
        //  第二段文字不一样：
        //  第三段文字一样：爸爸是好爸爸
        //解决抽出一个父类，父类中抽出一个模版方法
        Person p = new Student();
        p.write();
        p = new Teacher();
        p.write();
    }
}
