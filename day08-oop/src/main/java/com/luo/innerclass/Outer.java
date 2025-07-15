package com.luo.innerclass;

public class Outer {
    public static String schoolName="黑马";
   /* public void show() {
        System.out.println("show...");
    }*/
    //成员内部类无static修饰，属于外部类对象持有
    public class Inner {
        private String name;
        public void show() {
            System.out.println("show...");
            System.out.println(this);//自己的对象
            System.out.println(Outer.this);//获取外部类对象
        }
    }
}
