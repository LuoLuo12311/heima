package com.luo.innerclass3;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        //目标：了解匿名内部类的另一种使用场景完成给数组排序
        //准备一个学生类型的数组
        Student[] s =new Student[6];
        s[0]=new Student("小王", 18);
        s[1]=new Student("小张", 19);
        s[2]=new Student("小李", 17);
        s[3]=new Student("小赵", 20);
        s[4]=new Student("小王", 18);
        s[5]=new Student("小王", 18);



        //需求按照年龄进行排序
        //参数一：需要排序的数组
        //参数二：需要给的比较规则
        //sort方法会调用匿名内部类对象的compare方法对数组中的学生进行两两比较
        Arrays.sort( s, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //指定排序规则
                /*//如果认为左边大于右边，返回正数
                if(o1.getAge()>o2.getAge())
                    return 1;
                //如果认为左边小于右边，返回负数
                else if(o1.getAge()<o2.getAge())
                    return -1;
                //如果认为两边相等，返回0
                else
                    return 0;*/

                return o1.getAge()-o2.getAge();//升序
                //return o2.getAge()-o1.getAge();//降序
            }
        });
        //遍历数组
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getName()+","+ s[i].getAge());
        }

    }
}
