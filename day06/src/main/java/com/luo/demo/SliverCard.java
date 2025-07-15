package com.luo.demo;

public class SliverCard extends  Card{
    //银卡创建
    public SliverCard() {

    }
    public SliverCard(int carId, String driverName, String phoneNumber, int balance) {
        super(carId, driverName, phoneNumber, balance);
    }

    @Override
    public void pay(int money) {
        super.pay(money*9/10);
    }
}
