package com.luo.polymorphsm3;

public class Wolf  extends Animal {
    String name="Wolf";
    @Override//3子类实现存在方法重写
    public void run() {


        System.out.println("狼在跑dekuai");
    }

    //狼子类的独有方法
    public void eatSheep()
    {
        System.out.println("狼吃羊");
    }
}
