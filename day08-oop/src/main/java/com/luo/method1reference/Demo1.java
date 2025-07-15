package com.luo.method1reference;



import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        //目标：静态方法引用演示一个场景
        test();
    }
    public static void test(){
        Student[] s =new Student[6];
        s[0]=new Student("小王", 18);
        s[1]=new Student("小张", 19);
        s[2]=new Student("小李", 17);
        s[3]=new Student("小赵", 20);
        s[4]=new Student("小王", 18);
        s[5]=new Student("小王", 18);




        Arrays.sort( s, (o1, o2) -> o1.getAge()-o2.getAge());

        Arrays.sort( s, (o1, o2) -> Student.compareByAge(o1, o2));

        //如果一个lambda表达式只是调用一个静态方法，并且->前后的参数的形式一致，就可以直接使用静态方法引用
        //再简化
        Arrays.sort( s, Student::compareByAge);


        //遍历数组
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getName()+","+ s[i].getAge());
        }
    }
}
