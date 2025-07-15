package com.luo.abstract2;

public class Test {
    public static void main(String[] args) {
        //目的，搞清抽象类的好处
        Animal a = new Dog();
        a.shout();
    }
}
//当父类知道每个子类都要做某个行为，但做的都不一样时，这时就可以使用抽象类
