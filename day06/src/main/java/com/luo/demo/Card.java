package com.luo.demo;

import lombok.Data;

//lombok可以实现为类自动添加getter和setter方法，toString方法，equals方法，hashCode方法，
// 无参构造方法，toString方法，equals方法，hashCode方法
//只需要加一个@Data注解
@Data

public class Card {
    // 属性
    private int carId;
    private String driverName;
    private String phoneNumber;
    private int balance;

    //以下无论是构造方法还是一般getter方法，setter方法，toString方法，equals方法，都可以省略
    //只加@Data注解默认添加无参构造方法
    //若想添加有参构造方法，可以使用@AllArgsConstructor注解
    //但添加@AllArgsConstructor构造方法后，@Data注解将不再添加无参构造方法
    //想要再次使用无参构造方法，可以使用@NoArgsConstructor注解
    public Card(int carId, String driverName, String phoneNumber, int balance) {
        this.carId = carId;
        this.driverName = driverName;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public Card() {
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void pay(int money) {
        this.balance -= money;
        System.out.println("支付成功，余额为：" + balance);
    }
    public void recharge(int money) {
        this.balance += money;
        System.out.println("充值成功，余额为：" + balance);
    }
}
