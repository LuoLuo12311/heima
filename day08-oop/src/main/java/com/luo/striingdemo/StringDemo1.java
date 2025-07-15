package com.luo.striingdemo;

public class StringDemo1 {
    //使用双引号直接创建字符串对象与调用构造器创建字符串对象的区别
    //使用双引号创建字符串对象，会存储到字符串常量池中，且相同内容的字符串只存储一次
    //使用new字符调用构造器创建的字符串对象每new一次都会产生一个新的对象存放在堆内存中
    public static void main(String[] args) {
        //目标：创建字符串对象，封装要处理的字符串数据，调用String方法完成字符串处理

        String name = "黑马程序员，99,8";
        System.out.println(name
        );
        System.out.println(name.length());//字符串的长度
        //创建方式二
        String name1 = new String("黑马程序员，123,2321");//通过构造器创键对象
        System.out.println(name1);
        //创建方式三
//        字符数组
        char[] chars = {'黑','马','程','序','员'};
        String name2 = new String(chars);
        System.out.println(name2);
        //创建方式四
        //字节数组
        byte[] bytes = {97,98,99,100,101};
        String name3 = new String(bytes);
        System.out.println(name3);



        //使用双引号直接创建字符串对象与调用构造器创建字符串对象的区别
        //使用双引号创建字符串对象，会存储到字符串常量池中，且相同内容的字符串只存储一次（Java中为了节约内存才如此设计）
        //使用new字符调用构造器创建的字符串对象每new一次都会产生一个新的对象存放在堆内存中
        //下面进行演示
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s1 == s2);//true//地址一样
        System.out.println(s1 == s3);// false//地址不一样
        System.out.println(s3 == s4);// false//地址不一样
        System.out.println(s1 == s4);// false//地址不一样








        //调用字符串方法，处理字符串数据
        String s = "hello,world,hello,java,hello,world";
        String[] split = s.split(",");
        for (String s99 : split) {
            System.out.println(s1);
        }

        //字符串对象的内容比较千万不要使用==，因为==默认比较地址，使用equals方法比较内容
        String s5 = "hello";

        String s6 = "hello";
        System.out.println(s5.equals(s6));
        System.out.println(s5 == s6);
    }
}
