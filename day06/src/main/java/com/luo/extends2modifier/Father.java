package com.luo.extends2modifier;
//private修饰只能当前类访问
//public修饰都能访问
//protected修饰可以被当前类、子孙类、同一个包的其它类访问
//缺省修饰可以被当前类、同一个包的其它类访问
//一般自己用都用私有和公开
public class Father {
    private void privateMethod(){System.out.println("父类私有方法");}

    void method (){System.out.println("父类方法");}

    protected void protectedMethod(){System.out.println("父类受保护的方法");}

    public void publicMethod(){System.out.println("父类共有方法");}

    public static void main(String[] args) {
        Father f = new Father();
        f.privateMethod();
        f.method();
        f.protectedMethod();
        f.publicMethod();

    }
}
