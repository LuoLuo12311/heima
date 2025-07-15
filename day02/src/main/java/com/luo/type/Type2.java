package com.luo.type;
//表达式的自动类型提升
public class Type2 {
    public static void addValue(int a, int b, char c, double d, float e) {
        /*在表达式中，不同类型的数据会进行自动类型提升：
        1. 'a' 和 'b' 是 int 类型，相加结果仍然是 int 类型。
        2. 'c' 是 char 类型，在运算时会自动提升为 int 类型（对应 ASCII 值）。
        3. 接着，int 结果与 'c' 相加后仍然是 int 类型。
        4. 'e' 是 float 类型，与前面的 int 结果相加时，整个表达式会提升为 float 类型。
        5. 最后，'d' 是 double 类型，与前面的 float 结果相加时，整个表达式会进一步提升为 double 类型。
        因此，最终的表达式结果是 double 类型，并传递给 println 方法输出。*/
        System.out.println(a + b + c + d + e);
    }
    // byte,short ，char 类型的加法运算会自动提升为 int 类型
    //结果强制转换为 byte有可能导致溢出问题
public static byte addValue(byte a, byte b) {
        return (byte) (a + b);
    }
    public static void main(String[] args) {
        addValue(10, 20, 'a', 3.14, 5.0f);

        System.out.println(addValue((byte)10, (byte)20));
    }
}
