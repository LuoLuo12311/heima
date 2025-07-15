package com.luo.innerclass2;

public class InnerClassDemo2 {
    public static void main(String[] args) {
        //目标：搞清静态内部类的语法
        //语法：外部类名.静态内部类名
        Outer.Inner inner = new Outer.Inner();
        inner.show();
        //静态内部类中可以直接访问外部类的静态成员
        //静态内部类中不可以直接访问外部类的非静态成员变量，实例成员

    }
}
