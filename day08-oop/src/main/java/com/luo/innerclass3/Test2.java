package com.luo.innerclass3;

public class Test2 {
    public static void main(String[] args) {
        //目标：搞清楚匿名内部类的使用场景
        //通常可以作为一个对象参数传给方法使用


        Swim s=new S();
        s.swimming();
        s=new Teacher();
        s.swimming();

        show(new S());
        show(new Teacher());
        //通常可以作为一个对象参数传给方法使用
        show(new Swim() {
            @Override
            public void swimming() {
                System.out.println("匿名内部类可以游");
            }
        });

        //对象回调
        Swim s2=new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师可以游");
            }
        };
        show(s2);


    }
    //原本的解决方法
    public static void show(Swim s){
        System.out.println("开始游");
        s.swimming();
        System.out.println("结束游");
    }
}
interface Swim{
    void swimming();
}
class S implements Swim{

    @Override
    public void swimming() {

        System.out.println("学生可以游");
    }
}
class Teacher implements Swim{

    @Override
    public void swimming() {

        System.out.println("老师可以游");
    }
}