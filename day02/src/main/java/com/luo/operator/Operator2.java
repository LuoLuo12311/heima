package com.luo.operator;

public class Operator2 {
    //赋值运算符演示
    public static void printAssignmentOperators() {
        System.out.println("== 赋值运算符演示 ==");
        int a = 10;
        System.out.println("a = " + a);
        a += 5;// a = a + 5，加后赋值同下，减、乘、除、取余同理，自带强制转换，与a的类型一致
        System.out.println("a += 5 = " + a);
        a -= 5;
        System.out.println("a -= 5 = " + a);
        a *= 5;
        System.out.println("a *= 5 = " + a);
        a /= 5;
        System.out.println("a /= 5 = " + a);
        a %= 5;
        System.out.println("a %= 5 = " + a);


    }
    //三元运算符演示
    public static void printTernaryOperators() {
        System.out.println("== 三元运算符演示 ==");
        int a = 10;

        System.out.println("a > 5 ? a : 5 = " + (a > 5 ? a : 5));// 三元运算符 先计算关系运算，再计算结果

    }
    //逻辑运算符演示
    public static void printLogicOperators() {
        System.out.println("== 逻辑运算符演示 ==");
        int a = 10;
        System.out.println("a = " + a);
        //双与双或与单于单或的区别 前面条件满足时，后面条件不再判断
       int c=111;
       int b=2;
       System.out.println(c<b&&b++>2);
System.out.println(b);
System.out.println(c<b||b++>2);
System.out.println(b);

        System.out.println("a > 5 && a < 20 = " + (a > 5 && a < 20));
        System.out.println("a > 5 || a < 20 = " + (a > 5 || a < 20));
        System.out.println("! (a > 5) = " + !(a > 5));
        //异或
        System.out.println("a > 5 ^ a < 20 = " + (a > 5 ^ a < 20));
        //单与
        System.out.println("a > 5 & a < 20 = " + (a > 5 & a < 20));
        //单或
        System.out.println("a > 5 | a < 20 = " + (a > 5 | a < 20));
    }

    public static void main(String[] args) {

        printLogicOperators();
        printTernaryOperators();
        printAssignmentOperators();
    }
}

