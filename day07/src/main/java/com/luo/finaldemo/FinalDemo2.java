package com.luo.finaldemo;

public class FinalDemo2 {
    public static void main(String[] args) {
        //目标:详解常量
        //公司中一般会单独一个包或者文件专门放置常量Constant
        //好处:提高可读性，如果有一天需要修改常量，直接修改一个地方即可
        //对性能不会有影响，程序编译后，常量会被宏预处理，替换成常量值，变为字面量

        final String SCHOOL_NAME = "18";
        System.out.println(Contant.AGE);
    }

}
class Contant {

        public  static final int AGE = 18;


}
