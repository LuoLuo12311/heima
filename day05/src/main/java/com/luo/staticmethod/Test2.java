package com.luo.staticmethod;
//静态方法在开发中的应用
//常见应用场景，比如：工具类
//工具类是什么？
//工具类：封装了多个静态方法，每个方法完成一个功能，供开发人员直接使用，工具类中的方法不需要创建对象，就可以直接使用
//例如验证码工具类，生成4位验证码，或者一些通用功能
public class Test2 {
    //目标：搞清楚静态方法调用的流程
    //登录页面：用户名密码校验
    //作用提高代码的复用和效率
    public static void main(String[] args) {
        System.out.println(Util.getCode());
Util.getCode();
    }
}
