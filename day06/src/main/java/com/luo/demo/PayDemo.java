package com.luo.demo;

public class PayDemo {
    public static void main(String[] args) {
        Card c = new GoldCard( 1, "小王", "13800000001", 1000);
        Card c1 = new SliverCard( 2, "小李", "13800002001", 2000);



 }

 public static void pay() {
     System.out.println("欢迎使用加油站支付系统");
     while(true) {

         System.out.println("请选择您的业务：");
         System.out.println("1.会员卡支付");
         System.out.println("2.普通会员支付");
         System.out.println("3.办理会员卡");
         System.out.println("4.查询会员信息");
         System.out.println("5.卡片充值");
         System.out.println("6.退出");
         java.util.Scanner sc = new java.util.Scanner(System.in);
         int choice = sc.nextInt();
         switch (choice) {

             case 1:
                 System.out.println("会员卡支付");
                 System.out.println("请输入您的消费金额：");
                 int money2 = sc.nextInt();
                 Card card2 = new Card(1, "小王", "13800000001", 1000);
                 break;
             case 2:

             case 3:
                 Card card1 = new Card();
                 System.out.println("创建会员卡");
                 System.out.println("请输入您的车牌号马：");
                 int carId = sc.nextInt();
                 System.out.println("请输入您的会员姓名：");
                 String driverName = sc.next();
                 System.out.println("请输入您的手机号：");
                 String phoneNumber = sc.next();
                 System.out.println("请输入您的充值金额：");
                 int balance = sc.nextInt();
                 if(balance > 5000){
                     Card card = new GoldCard(carId, driverName, phoneNumber, balance);
                     System.out.println("恭喜您办理金卡成功！");}

                 else if(balance > 2000){
                     Card card = new SliverCard(carId, driverName, phoneNumber, balance);
                     System.out.println("恭喜您办理银卡成功！");
                 }
                 else{
                     Card card = new Card(carId, driverName, phoneNumber, balance);
                     System.out.println("恭喜您办理普通卡成功！");
                 }


             case 4:


             case 5:
                 System.out.println("=======卡片充值==========");
                 System.out.println("请输入您的会员卡号：");
                 int cardId = sc.nextInt();
                 System.out.println("请输入充值金额：");
                 int money = sc.nextInt();
                 Card card3 = new Card(cardId, null, null, 0);
                 card3.recharge(money);

             case 6:

                 System.out.println("已经退出");
                 System.out.println("===========================");
                 break;
             default:
                 System.out.println("输入的选项有误！");
                 System.out.println("===========================");
                 break;
         }


     }

 }

    }


