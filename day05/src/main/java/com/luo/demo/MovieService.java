package com.luo.demo;

public class MovieService {

    private  Movie[] movies;
    private  int movieCount;

    public MovieService(Movie[] m) {
      movies = m;
    }
//打印所有电影
    public void printAllMovies() {
        movieCount= movies.length;
        System.out.println("=====全部电影信息如下=====");
        System.out.println("电影名称  编号  价格  主演");
        for (int i = 0; i < movieCount; i++) {
Movie movie = movies[i];
            System.out.println(movies[ i].getName()+"  "+movies[i].getId()+"  "+movies[i].getPrice()+"  "+movies[i].getActor());
        }
    }

    public void searchMovieById() {
        movieCount= movies.length;
        System.out.println("=====编号查询功能=====");
        System.out.println("请输入要查询的编号：");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int id = sc.nextInt();
        if(id<=0||id>movieCount)System.out.println("编号不存在");
        else {
            for (int i = 0; i < movieCount; i++) {
                if (movies[i].getId() == id) {
                    System.out.println("编号：" + movies[i].getId() + "  名称：" + movies[i].getName() + "  价格：" + movies[i].getPrice() + "  主演：" + movies[i].getActor());
                    return;
                }
            }
        }
    }
}
