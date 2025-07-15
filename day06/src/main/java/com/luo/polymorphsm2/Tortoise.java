package com.luo.polymorphsm2;

public class Tortoise extends Animal {
    String name="乌龟";
    @Override
    public void run() {


        System.out.println("乌龟在爬");
    }
    //乌龟子类的独有方法缩头
    public void suoTou(){
        System.out.println("乌龟缩头");
    }
}
