package com.luo.lambda;

import com.luo.innerclass3.Student;

import java.util.Arrays;

public class LambadaDemo2 {

    public static void main(String[] args) {
        //目标：理解lambda表达式案例二：使用lambda表达式简化comparator接口的匿名内部类



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
  /*      Arrays.sort( s, new Comparator<Student>() {
            @Override
                return o1.getAge()-o2.getAge();//升序
                //return o2.getAge()-o1.getAge();//降序
            }
        });*/
        //目标：了解lambda表达式案例二：使用lambda表达式简化comparator接口的匿名内部类
        Arrays.sort( s, (Student o1, Student o2) -> {
            return o1.getAge()-o2.getAge();
        });
        //如果只有一个参数时，可以省略参数小括号多个不行
        //参数类型可以全部不写

        //再简化表达式中只有一行代码时可以去掉大括号同时省略分号，如果是return语句同时也必须去掉return
        Arrays.sort( s, (o1, o2) -> o1.getAge()-o2.getAge());







        //遍历数组
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].getName()+","+ s[i].getAge());
        }

    }
}
