package com.luo.array;

public class ArrayTest {
    public static void main(String[] args) {


        printPoker();
    }
    //斗地主
    //存牌，洗牌
    public static void printPoker(){
        // 初始化54张牌的数组（4种花色*13个点数 + 2张王）
        String[] poker = new String[54];
        
        // 定义四种花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        // 定义13个点数数组
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        // 创建普通牌（4*13=52张）
        int index = 0; // 数组索引计数器
        // 外层循环遍历花色
        for(int i = 0; i < colors.length; i++){
            // 内层循环遍历点数
            for(int j = 0; j < numbers.length; j++){
                // 拼接花色+点数并存入数组
                poker[index] = colors[i] + numbers[j];
                index++; // 移动到下一个存储位置
            }
        }
        // 添加大小王
        poker[index] = "小王";
        poker[index+1] = "大王";
        
        // 打印牌（每行显示13张）
        for (int i = 0; i < poker.length ; i++) {
            // 打印当前牌并添加空格
            System.out.print((poker[i]) + " ");
            // 每13张牌换行显示
            if(i % 13 == 0){
                System.out.println();
            }
        }
//洗牌
        for (int i = 0; i < poker.length; i++) {
            int index1 = (int)(Math.random() * poker.length);
            String temp = poker[i];
            poker[i] = poker[index1];
            poker[index1] = temp;
        }
        System.out.println("洗牌后：");
        for (int i = 0; i < poker.length ; i++) {
            // 打印当前牌并添加空格
            System.out.print((poker[i]) + " ");
            // 每13张牌换行显示
            if(i % 13 == 0){
                System.out.println();
            }
        }
    }

}
