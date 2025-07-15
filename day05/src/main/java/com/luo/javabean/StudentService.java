package com.luo.javabean;

public class StudentService {
    //拿到学生对象
    private Student s;//用来记住将来要操作的学生对象

    public StudentService(Student s){
        this.s=s;
    }
    //打印学生总成绩
    public void printSum(){
        System.out.println("学生总成绩为："+(s.getMath()+s.getChinese()));
    }

    //打印平均分
    public void printAvg(){
        System.out.println("学生平均分为："+(s.getMath()+s.getChinese())/2);
    }
}
