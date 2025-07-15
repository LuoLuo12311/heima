package com.luo.method1reference;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {
    public static void main(String[] args) {
        //目标：特定类型的方法引用
        //需求：有一个字符串数组，里面有一些人的名字，请按照名字首字母升序排序
        String[] names = {"lisi","zhangsan","wangwu","zhaoliu","罗阿里元", "ali","bli","Aooo"};
        //按照名字首字母升序排序
        Arrays.sort(names, String::compareTo);//他是按照首字母的ask码值进行排序的升序
        //要求忽略首字母的大小进行升序排序（java官方默认无法解决，需要我们自己指定规则）
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);//按照首字母忽略大小写进行排序的的方法
            }
        });
        //如果某个lambda表达式只是调用一个特定类型的实例方法
        // ，并且前面参数列表中的第一个参数是作为方法的主调，后面的所有参数都是作为该实例的方法入参的，
        // 则此时可以使用特定类型的方法引用
        //简化过后
        Arrays.sort(names, String::compareToIgnoreCase);
        //遍历数组
        System.out.println( Arrays.toString( names));
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
