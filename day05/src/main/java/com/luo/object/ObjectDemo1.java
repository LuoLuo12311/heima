package com.luo.object;

public class ObjectDemo1 {
    public static void main(String[] args) {
        Star s1 = new Star();
        Star s2=new Star();
        s1.name="小王";
        s1.age=18;
        s1.height=1.7;
        s1.gender="男";
        s1.weight=50.5;
        s2.name="小王";
        s2.age=18;
        s2.height=1.7;
        s2.gender="女";

Student a[]=new Student[2];

a[0]=new Student();
a[1]=new Student();
a[0].name="小王";
a[0].chinese=80;
a[0].english=90;
a[1].name="小王";
a[1].chinese=80;
a[1].english=90;
Student.getSum(a);
Student.getAvg(a);


    }
}

