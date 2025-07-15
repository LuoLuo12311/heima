package com.luo.extends5constructor;

public class Test {
    //目标：了解子类构造器的特点，用法

    //子类构造器必须先调用父类的构造器，再执行自己的构造器
    //如果子类没有显示调用父类的构造器，则默认调用父类的无参构造器
    //如果子类显示调用父类的构造器，则必须使用super()
    public static void main(String[] args) {
        Zi zi = new Zi(1, 2, 3);
        //子类调用父类的应用场景
        //
    }
}
class Fu {
    private int a;
    private int b;
    public Fu()
    {
        System.out.println("父类无参构造器");
    }
    public Fu(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("父类有参构造器");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
class Zi extends Fu {
    private int c;
    public Zi()
    {
        //super();
        System.out.println("子类无参构造器");
    }
    public Zi(int c, int a, int b)
    {
        super(a,b);//super关键字父类有参构造器
        this.c=c;
        System.out.println("子类有参构造器");
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
