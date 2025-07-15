package com.luo.extends4override;

public class Test {
    //目标：认识方法重写搞清应用场景
//开发中记住八个字：声明不变，重新实现

}
class Animal{
    public void pronunce(){
        System.out.println("叫声");
    }

}
class Dog extends Animal{
    //字父类方法重写，方法名称形参列表必须相同

    @Override//override注解，方法重写的校验注解，要求方法名与形参列表与被重写的方法必须一致
    public void  pronunce(){
        System.out.println("汪汪汪");
    }
}
class Cat extends Animal{
    @Override//加上注解更安全，可读性更好
    public void pronunce(){
        System.out.println("喵喵喵");
    }
}
