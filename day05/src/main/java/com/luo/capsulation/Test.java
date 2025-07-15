package com.luo.capsulation;

public class Test {
    public static void main(String[] args)
    {
       //掌握封装的设计思想：合理隐藏合理暴露

        Student s1 = new Student();
        //s1.age=-18;//没有合理隐藏可以乱赋值不安全
        s1.setAge(-18);
        System.out.println(s1.getAge());
        System.out.println("========================");
        s1.setAge(18);
        System.out.println(s1.getAge());

    }
}
