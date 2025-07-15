package com.luo.demo;

public class GoldCard extends Card{
    //重写构造器
    public GoldCard(int carId, String driverName, String phoneNumber, int balance) {
        super(carId, driverName, phoneNumber, balance);
        if(balance >= 5000){
        System.out.println("金卡办理成功");}
        else{
            System.out.println("金卡办理失败");
            return;
        }


    }
    public GoldCard() {

    }
    //金卡支付时享用8折优惠
    @Override
    public void pay(int money) {
        super.pay(money * 8 / 10);

    }
    //金卡消费两百元提供打印免费洗车服务
    public void print() {
        System.out.println("免费洗车服务");
    }
}
