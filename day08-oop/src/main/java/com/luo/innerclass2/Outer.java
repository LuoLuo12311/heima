package com.luo.innerclass2;

public class Outer {
    public static String schoolName="黑马";
    public void show()
    {
        System.out.println("show方法");
    }
    public static class Inner
    {
        public void show()
        {
            System.out.println("show方法");
            System.out.println("schoolName:"+schoolName);
        }
    }
}
