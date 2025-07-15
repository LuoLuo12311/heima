package com.luo.innerclass3;

public class InnerClassDemo3 {
    public static void main(String[] args) {
        //认识匿名内部类，以及其基本作用
        //匿名内部类实际上有一个默认的名字，外部类名$编号。class
        //匿名内部类的本质，就是一个子类，同时会立即构建一个子类对象


        Animal a = new Animal() {
            @Override
            public void cry() {

                System.out.println("匿名内部类");
            }

        };
        a.cry();
    }

}
