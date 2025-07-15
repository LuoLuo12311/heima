package com.luo.method1reference;

public class Demo4 {
    public static void main(String[] args) {
        //目标：理解构造器引用的方法应用
        //创建了接口的匿名内部类对象
        CarFactory factory1 = new CarFactory( ) {
            @Override
            public Car getCar(String  name) {
                return new Car("小汽车");
            }
        };
        //经过函数式编程的第一步简化
        CarFactory factory2 = name -> new Car(name);
        //最终简化
        //如果一个lambda表达式只是在创建对象，并且在->前后参数情况一致，则可以使用构造器引用
        CarFactory factory = Car::new;

    }
}
interface CarFactory{
    public Car getCar( String  name);
}
class Car{
    public Car()
    {
        System.out.println("无参构造器");
    }
    public Car(String name)
    {
        System.out.println("有参构造器");
    }
    public void run()
    {
        System.out.println("车在跑");
    }
}
