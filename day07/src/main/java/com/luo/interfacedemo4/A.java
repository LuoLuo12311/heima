package com.luo.interfacedemo4;

public interface A {
    //新增方法
//1.默认方法（普通实例方法），但在接口中实现时必须加default关键字进行修饰
    //而且默认会使用public修饰，不需要再写
    //如何调用？，使用实现类调用
   public default void show()
    {
        System.out.println("默认执行");
        show2();
    }
    //2.私有方法从jdk9才开始支持

    //私有的实例方法
    //如何调用：只能使用接口中其他实例方法调用
   private void show2(){
        System.out.println("私有方法执行");
    }
    //3.静态方法
    //默认使用public修饰
    //如何调用：只能使用当前接口名来调用
    public static void show3(){
        System.out.println("静态方法执行");
    }



}
class B implements A
{
    public static void main(String[] args)
    {
        B b = new B();
        b.show();
        A.show3();
    }
    public void show()
    {
        System.out.println("B类执行");
    }
}
