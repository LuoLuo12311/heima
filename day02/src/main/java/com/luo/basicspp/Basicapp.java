package com.luo.basicspp;

public class Basicapp {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入性别（男/女）：");
        char sex = sc.next().charAt(0);
        System.out.println("请输入身高（米）：");
        double height = sc.nextDouble();
        System.out.println("请输入体重（公斤）：");
        double weight = sc.nextDouble();
        
        bmiCalculate(height, weight);
        bmrCalculate(age, sex, height, weight);
    }

    public static void bmiCalculate(double height, double weight) {
        double bmi = weight / (height * height);
        System.out.println("你的BMI值是=" + bmi);
    }

    public static void bmrCalculate(int age, char sex, double height, double weight) {
        double bmr;
        // 根据性别选择计算公式
        if (sex == '男' || sex == '男') {
            // 男性BMR公式：10*体重(kg) + 6.25*身高(cm) -5*年龄 +5
            bmr = 10 * weight + 6.25 * (height * 100) - 5 * age + 5;
        } else {
            // 女性BMR公式：10*体重(kg) + 6.25*身高(cm) -5*年龄 -161
            bmr = 10 * weight + 6.25 * (height * 100) - 5 * age - 161;
        }
        System.out.println("你的基础代谢率(BMR)=" + bmr + " 千卡/天");
    }
}