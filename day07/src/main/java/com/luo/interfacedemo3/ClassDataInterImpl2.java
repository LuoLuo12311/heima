package com.luo.interfacedemo3;

public class ClassDataInterImpl2 implements ClassDataInter{

    Student[] students ;//记住送过来的学生

    public ClassDataInterImpl2(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentInfos() {
        System.out.print("全体学生信息如下");
        for (Student student : students) {

            System.out.println(student.getName()+"---"+student.getSex()+"---"+student.getScore());
        }

    }

    @Override
    public void printAllAverageScore() {

    }
}
