package com.luo.method1reference;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        //目标：实例方法引用演示一个场景
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




       /* Arrays.sort( s, (o1, o2) -> o1.getAge()-o2.getAge());

        Arrays.sort( s, (o1, o2) -> Student.compareByAge(o1, o2));
*/
        //如果一个lambda表达式只是调用一个静态方法，并且->前后的参数的形式一致，就可以直接使用静态方法引用
        //再简化
        Arrays.sort( s, Student::compareByAge);


        //实例方法引用
        Student t=new Student();

//        Arrays.sort( s, (o1, o2) -> t.compareByName(o1, o2));

        //引用实例方法简化，：对象名：：实例方法
        //前提：如果某个lambda表达式只是通过对象名称调用一个实例方法，
        // 并且->前后的参数形式一致，就可以使用实例方法引用
        //简化
        Arrays.sort( s, t::compareByName);


        //遍历数组
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getName()+","+ s[i].getAge());
        }
    }
}
