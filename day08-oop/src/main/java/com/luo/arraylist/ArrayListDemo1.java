package com.luo.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //目标：掌握ArrayList集合的创建和使用
        //创建ArrayList集合
        ArrayList<String> list=new ArrayList<>();
        //添加数据
        list.add("hello");
        list.add("world");
        list.add("java");
        //查看数据
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("hello"));
        //删除数据
        list.remove("hello");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("hello"));
        list.clear();
        //修改数据
        list.add("hello");
        list.add("world");
        list.add("java");
        list.set(0,"java");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
