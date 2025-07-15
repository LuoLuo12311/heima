package com.luo.thisdemo;

public class Student {
    String name;
    public void print(){
        //this是一个变量用在方法中拿到当前对象
        //哪个对象调用print方法，this就拿到哪个对象

        System.out.println(this);
        System.out.println(this.name);
    }

    public void likeHabby(String name){
        System.out.println(this.name+"喜欢"+name);
    }
}
