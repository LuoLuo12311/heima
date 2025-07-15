package com.luo.array;

public class ArrayDemo2 {
    //动态初始化数组
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        inoutScore();
        searchMax( arr);
        System.out.println("最大值是："+searchMax(arr));
    }
    public static void inoutScore(){
        //动态初始化数组
        double [] score = new double[5];
        for(int i=0;i<score.length;i++) {
            System.out.println("请输入第" + (i + 1) + "个同学的分数：");
            score[i] = new java.util.Scanner(System.in).nextDouble();
            System.out.println("第" + (i + 1) + "个同学的分数是：" + score[i]);
            System.out.println("----------------------------------");



        }
        System.out.println("平均分是：" + (score[0]+score[1]+score[2]+score[3]+score[4])/5);

    }

    //一维数组，求最值案例
    public static int searchMax(int arry[]){
int max=arry[0];
for(int j=1;j<arry.length ;j++){
    int data=arry[j];
    if(data>max){
            max=  data;
    }
}

        return max;
    }
}
