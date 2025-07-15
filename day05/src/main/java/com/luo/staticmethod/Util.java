package com.luo.staticmethod;
// 工具类中使用静态方法的原因
//调用方便，节省内存
public class Util {
// 静态方法生成验证码
    //工具类因为没有创建对象的需求，建议将工具类的构造器私有化
    private Util(){}
    public static String getCode(){
        String code = "";
        for(int i = 0; i < 4; i++){
            int number = (int)(Math.random() * 10);
            code += number;
        }
        return code;
    }
}
