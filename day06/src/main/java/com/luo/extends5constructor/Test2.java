package com.luo.extends5constructor;

public class Test2 {
    public static void main(String[] args) {
        //目标：理解this(....)调用兄弟构造器

        Student student = new Student("小王", 18, 1001);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getId());
        System.out.println(student.getSchoolName());
        System.out.println(student);
    }
}
