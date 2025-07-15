package com.luo.capsulation;

public class Student {
    //1.如何合理隐藏，使用private关键字修饰成员变量，就只能在本类中访问
    //其它地方不能直接访问
//隐藏成员变量，暴露方法
      private String name;
      private int age;
      private double chinese;
      private double math;

    //2.如何合理暴露，使用public关键字修饰的get方法和set方法合理暴露
    //成员变量的赋值取值
    public void setName(String name){
        this.name = name;//为名字赋值
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age < 0 || age > 120){
            System.out.println("年龄不合法");
            return;
            //一般建议前端进行校验，但是后端同时也进行校验更安全
        }
        else
        {this.age = age;}
    }

    public int getAge(){
        return age;
    }
    //打印总成绩
    public void printSum(){
        System.out.println(name + "的总成绩是：" + (chinese + math));
    }

    public void printAvg(){
        System.out.println(name + "的平均成绩是：" + (chinese + math) / 2);
    }
}
