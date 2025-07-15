package com.luo.array;

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {

nameAdd();
    }
    //数组demo，随机点名小程序
    public static void nameAdd(){
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        String[] name={"小王","小张","小李","小赵","小钱"};
        String[] name1=new String[5];//第二种定义方式
        String name3[]={"小王","小张","小李","小赵","小钱"};//第三种定义方式
        int i=(int)(Math.random()*name.length);//
        System.out.println(name[i]);
        System.out.println("是否继续？y/n");
        String choice=new Scanner(System.in).next();
        while(choice.equals("y")){
            nameAdd();
        }
    }
}
