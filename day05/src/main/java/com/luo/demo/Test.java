package com.luo.demo;

public class Test {
    public static void main(String[] args) {
        //目标完成面向对象的综合案例
        //设计电影类，创建电影对象Movie类

        //封装全部的电影数据
        Movie m[]=new Movie[5];
        m[0]=new Movie("唐顿庄园",1,9.5,"唐顿·戴维森");

        m[1]=new Movie("冰雪奇缘",2,9.5,"唐顿·戴维森");

        m[2]=new Movie("唐顿庄园",3,9.5,"唐顿·戴维森");
        m[3]=new Movie("冰雪奇缘",4,9.5,"唐顿·戴维森");
        m[4]=new Movie("唐顿庄园",5,9.5,"唐顿·戴维森");

        //3.创建电影操作对象，专门负责电影操作
        MovieService mS=new MovieService( m);

        mS.printAllMovies();//快捷创建方法
        mS.searchMovieById();//ALT键+回车
    }
}
