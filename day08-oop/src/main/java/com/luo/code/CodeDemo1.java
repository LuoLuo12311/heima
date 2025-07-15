package com.luo.code;

public class CodeDemo1 {
    public static String name;
    //静态代码块，有static关键字修饰属于类，与类一起优先加载，自动执行一次
    //基本作用，可以完成对类静态资源的初始化
    static {
        System.out.println("静态代码块执行了");
         name="luo";
    }

    public static void main(String[] args) {

        System.out.println("main方法执行了");
        System.out.println("name:"+name);

    }
}
