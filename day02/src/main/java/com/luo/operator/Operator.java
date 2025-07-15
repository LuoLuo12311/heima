package com.luo.operator;

public class Operator {

    public static void main(String[] args) {
        printBasicOperators();
        printStringConcatenation();
        printIncrementOperators();
    }

    // 演示基本算术与比较运算符
    private static void printBasicOperators() {
        System.out.println("== 基本运算符演示 ==");
        System.out.println("10 + 20 = " + (10 + 20));  // 加法运算
        System.out.println("10 - 20 = " + (10 - 20));  // 减法运算
        System.out.println("10 * 20 = " + (10 * 20));  // 乘法运算
        System.out.println("10 / 20 = " + (10 / 20));  // 整数除法
        System.out.println("10 % 20 = " + (10 % 20));  // 取模运算
        System.out.println("10 > 20 = " + (10 > 20));  // 大于比较
        System.out.println("10 < 20 = " + (10 < 20));  // 小于比较
        System.out.println("10 >= 20 = " + (10 >= 20)); // 大于等于比较
        System.out.println("10 <= 20 = " + (10 <= 20)); // 小于等于比较
    }

    // 演示字符串连接与运算符优先级
    private static void printStringConcatenation() {
        System.out.println("\n== 字符串连接与优先级演示 ==");
        System.out.println("\"hello\" + \"world\" = " + "hello" + "world"); // 字符串直接拼接
        System.out.println("10 + 20 = " + 10 + 20); // 注意：这里+为字符串连接
        System.out.println("10 + \"hello\" = " + 10 + "hello"); // 数字转字符串
        System.out.println("\"hello\" + 10 + 20 = " + "hello" + 10 + 20); // 从左到右执行
        System.out.println("\"hello\" + (10 + 20) = " + "hello" + (10 + 20)); // 括号改变优先级
        System.out.println("\"hello\" + 10 * 20 = " + "hello" + 10 * 20); // 先乘法后连接
        System.out.println("10 + 'a' + \"hello\" = " + (10 + 'a' + "hello")); // 10+97=107后连接
        System.out.println("20 * 10 + 10 + \"hello\" = " + (20 * 10 + 10 + "hello")); // 运算优先级演示
    }

    // 演示自增自减运算符
    private static void printIncrementOperators() {
        System.out.println("\n== 自增自减运算符演示 ==");
        int a = 10;
        System.out.println("a = " + a);

     int c=a++;//先赋值再自增，相当于c=a，a=a+1
     System.out.println("a = "+a);
     System.out.println("b = "+ c);
     int d=++a;
     System.out.println("a = "+a);
     System.out.println("d = "+d);
        // 复杂表达式演示
        System.out.println("\n复杂表达式: a++ + ++a");
        int b = 5;
        System.out.println("初始 b = " + b);
        int result = b++ + ++b; // 关键演示
        System.out.println("计算结果 = " + result);
        System.out.println("最终 b = " + b);
    }
}
