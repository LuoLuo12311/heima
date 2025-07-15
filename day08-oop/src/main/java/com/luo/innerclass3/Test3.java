package com.luo.innerclass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        //目标：掌握匿名内部类的使用场景
        //开发中不是我们主动要去写匿名内部类，而是用别人功能的时候，别人可以让我们使用匿名内部类的时候我们才会写

        //需求创建一个窗口，窗口上只有一个登录按钮
        JFrame win=new JFrame("登录界面");
        JButton btn=new JButton("登录");
        win.add(btn);
        win.setSize(400,300);
        win.setVisible(true);
        //java要求必须必须给这个按钮添加一个点击事件监听器对象这样就可以对用户的点击操作做出反应
        //1
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登录");
            }
        });
    }
}
//2
class ClickListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("登录");
    }
}
