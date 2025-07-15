package com.luo.staticfield;

public class Test3 {

    // 静态成员变量
    static int staticVar = 10;
    
    // 实例成员变量
    int instanceVar = 20;

    // 静态方法
    public static void staticMethod() {
        // 可以直接访问静态成员
        System.out.println("Static method accessing static variable: " + staticVar);
        
        // 不可以直接访问实例成员
        
        // 静态方法中不可以出现this关键字
    }

    // 实例方法
    public void instanceMethod() {
        // 既可以访问静态成员，也可以访问实例成员
        System.out.println("Instance method accessing static variable: " + staticVar);
        System.out.println("Instance method accessing instance variable: " + instanceVar);
        
        // 实例方法中可以出现this关键字
        System.out.println("This keyword in instance method: " + this.instanceVar);
    }

    public static void main(String[] args) {
        // 调用静态方法
        staticMethod();
        
        // 创建对象并调用实例方法
        Test3 test3 = new Test3();
        test3.instanceMethod();
    }
}
