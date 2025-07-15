package com.luo.singleinstance;

// 单例模式
//懒汉模式
//用对像时才开始创建对象
public class B {
    //私有化构造方法
    private B(){

    }
    //私有化静态变量
    private static B b;
    //提供静态方法获取对象,真正需要对象的时候才创建对象
    public static B getInstance(){
        if(b == null){
            b = new B();
        }
        return b;
    }
}
