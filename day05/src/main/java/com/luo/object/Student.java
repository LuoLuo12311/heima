package com.luo.object;

public class Student {
    String name;
    int chinese;
    int english;
    public static void getSum(Student s[]){
        int sum1 = 0;int sum2 = 0;
        for (int i = 0; i < s.length; i++) {
            sum1=sum1+s[i].chinese;
            sum2=sum2+s[i].english;
        }
        System.out.println("语文总分："+sum1);
        System.out.println("英语总分："+sum2);

    }
    public static void getAvg(Student s[]){
        int sum1 = 0;int sum2 = 0;
        for (int i = 0; i < s.length; i++) {
            sum1=sum1+s[i].chinese;
            sum2=sum2+s[i].english;
        }
        System.out.println("语文平均分："+sum1/s.length);
        System.out.println("英语平均分："+sum2/s.length);
    }
}
