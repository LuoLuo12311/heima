package com.luo.ifswich;
//switch语句通过比较值相等的情况来执行分支
public class SwitchDemo {
    public static void main(String[] args) {
        while(true){test1();}

    }
    //方法通过比较男女性别不同来推荐书籍
    public static void test1() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入性别：");
        String sex = sc.next();
        switch (sex) {
            case "男":
                System.out.println("推荐《java从入门到放弃》");
                break;
            case "女":
                System.out.println("推荐《红楼梦》");
                break;
            default:
                System.out.println("请输入正确的性别");
        }

    }
}
//if功能多，swich性能好，特定功能时用swich，值匹配时用户switch