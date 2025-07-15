package com.luo.javabean;

public class Test {
    //目标：搞清实体类的定义，基本作用和应用场景
    //实体类：封装数据的类,创建对象存取数据
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("小王");
        s.setAge(18);
        s.setChinese(90);
        s.setMath(80);
        System.out.println(s.getName());
        //实体类再开发中的应用场景（分层思想）
        //开发过程中，实体类一般只负责数据的存取，
        //对业务的处理交给其它类的对象来完成
        //以实现数据和数据业务相分离
        //===============================================

        StudentService s2 = new StudentService(s);
        s2.printSum();
        s2.printAvg();

    }
}
