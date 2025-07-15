package com.luo.staticfield;
//静态变量的应用场景
//1.如果某个数据只需要一份，且希望能被共享与访问修改
//例如：应用启动后，要求用户类可以记住自己创建了多少个对象，那么这个数据就可以用静态变量保存
public class User {
     static int count = 0;
    public User(){
        count++;
    }
}
