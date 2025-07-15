package com.luo.polymorphsm1;

public class Wolf  extends Animal{
    String name="Wolf";
    @Override//3子类实现存在方法重写
    public void run() {


        System.out.println("狼在跑dekuai");
    }
}
