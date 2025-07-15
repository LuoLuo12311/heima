package com.luo.code;

public class CodeDemo2 {
    //实例代码块，无static修饰属于对象，每次创建对象时都会优先执行一次
    //基本作用，初始化对象的实例资源
    private String name="张三";
    {
        System.out.println("======实例代码块执行======");
        name = "李四";

    }

    public static void main(String[] args) {
        CodeDemo2 c1 = new CodeDemo2();
        CodeDemo2 c2 = new CodeDemo2();
        CodeDemo2 c3 = new CodeDemo2();

    }
}
