package com.luo.demo;

public class Movie {
    private String name;
    private  int id;
    private double price;
    private String actor;

    //定义一个有参构造器
    public Movie(String name, int id, double price, String actor) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.actor = actor;

    }
//有了有参一定要有无参
    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
