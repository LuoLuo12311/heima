# Java基础语法详解

## 目录
- [Java程序基本结构](#java程序基本结构)
- [注释](#注释)
- [变量与数据类型](#变量与数据类型)
- [运算符](#运算符)
- [流程控制](#流程控制)
- [数组](#数组)
- [方法](#方法)
- [命名规范](#命名规范)
- [输入输出](#输入输出)
- [异常处理基础](#异常处理基础)

---

## Java程序基本结构

```java
// 类定义（文件名必须与公共类名相同）
public class HelloWorld {
    
    // main方法是程序入口点
    public static void main(String[] args) {
        // 输出语句
        System.out.println("Hello, World!"); 
    }
}
```

**关键元素**:
- `public`：访问修饰符
- `class`：类定义关键字
- `static`：静态方法修饰符
- `void`：方法无返回值
- `String[] args`：命令行参数

---

## 注释

```java
// 单行注释

/*
 多行注释
 可以跨越多行
*/

/**
 * 文档注释（用于生成API文档）
 * @param 参数说明
 * @return 返回值说明
 */
```

---

## 变量与数据类型

### 基本数据类型
| 类型      | 大小     | 取值范围                 | 默认值   | 示例           |
|-----------|----------|--------------------------|----------|----------------|
| `byte`    | 8位      | -128 ~ 127              | 0        | `byte b = 100;`|
| `short`   | 16位     | -32768 ~ 32767          | 0        | `short s = 500;`|
| `int`     | 32位     | -2³¹ ~ 2³¹-1            | 0        | `int i = 100000;`|
| `long`    | 64位     | -2⁶³ ~ 2⁶³-1            | 0L       | `long l = 100L;`|
| `float`   | 32位     | IEEE 754标准            | 0.0f     | `float f = 3.14f;`|
| `double`  | 64位     | IEEE 754标准            | 0.0d     | `double d = 3.14159;`|
| `char`    | 16位     | Unicode字符(0~65535)    | '\u0000' | `char c = 'A';`|
| `boolean` | 1位      | true/false              | false    | `boolean flag = true;`|

### 引用数据类型
- 类（如String）
- 接口
- 数组

### 变量声明与初始化
```java
// 声明变量
int age;

// 初始化变量
age = 25;

// 声明并初始化
double price = 19.99;

// 常量声明（不可修改）
final double PI = 3.14159;
```

### 类型转换
```java
// 自动类型转换（小->大）
int numInt = 100;
double numDouble = numInt;  // 100.0

// 强制类型转换（大->小）
double value = 9.87;
int intValue = (int) value;  // 9（截断小数部分）
```

---

## 运算符

### 算术运算符
```java
int a = 10, b = 3;
a + b;  // 13 加法
a - b;  // 7  减法
a * b;  // 30 乘法
a / b;  // 3  除法（整数除法）
a % b;  // 1  取模
a++;    // 11 自增
b--;    // 2  自减
```

### 关系运算符
```java
a == b;  // false 等于
a != b;  // true  不等于
a > b;   // true  大于
a < b;   // false 小于
a >= b;  // true  大于等于
a <= b;  // false 小于等于
```

### 逻辑运算符
```java
boolean x = true, y = false;
x && y;  // false 逻辑与
x || y;  // true  逻辑或
!x;      // false 逻辑非
```

### 赋值运算符
```java
int n = 10;
n += 5;  // 等价于 n = n + 5 → 15
n -= 3;  // 12
n *= 2;  // 24
n /= 4;  // 6
n %= 4;  // 2
```

---

## 流程控制

### if-else语句
```java
int score = 85;

if (score >= 90) {
    System.out.println("优秀");
} else if (score >= 80) {
    System.out.println("良好");  // 输出此项
} else if (score >= 60) {
    System.out.println("及格");
} else {
    System.out.println("不及格");
}
```

### switch语句
```java
int day = 3;
String dayName;

switch (day) {
    case 1:
        dayName = "星期一";
        break;
    case 2:
        dayName = "星期二";
        break;
    case 3:
        dayName = "星期三";  // 输出此项
        break;
    default:
        dayName = "无效日期";
}
```

### 循环结构
**for循环**
```java
for (int i = 0; i < 5; i++) {
    System.out.print(i + " ");  // 0 1 2 3 4
}
```

**while循环**
```java
int count = 3;
while (count > 0) {
    System.out.println(count);
    count--;
}
// 输出:
// 3
// 2
// 1
```

**do-while循环**
```java
int num = 5;
do {
    System.out.println(num);  // 至少执行一次
    num++;
} while (num < 3);
// 输出: 5
```

---

## 数组

### 一维数组
```java
// 声明数组
int[] numbers;

// 创建数组（5个元素）
numbers = new int[5]; 

// 声明并初始化
int[] primes = {2, 3, 5, 7, 11};

// 访问元素
System.out.println(primes[0]);  // 2

// 修改元素
primes[1] = 13;

// 遍历数组
for (int i = 0; i < primes.length; i++) {
    System.out.println(primes[i]);
}
```

### 二维数组
```java
// 声明二维数组
int[][] matrix = new int[3][3];

// 初始化
int[][] grid = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// 访问元素
System.out.println(grid[1][2]);  // 6

// 遍历二维数组
for (int i = 0; i < grid.length; i++) {
    for (int j = 0; j < grid[i].length; j++) {
        System.out.print(grid[i][j] + " ");
    }
    System.out.println();
}
```

---

## 方法

### 方法定义
```java
// 无返回值方法
public static void greet(String name) {
    System.out.println("Hello, " + name + "!");
}

// 有返回值方法
public static int add(int a, int b) {
    return a + b;
}

// 方法重载（同名不同参）
public static double add(double a, double b) {
    return a + b;
}
```

### 方法调用
```java
greet("Alice");  // 输出: Hello, Alice!
int sum = add(5, 7);  // sum = 12
double result = add(3.5, 2.1);  // result = 5.6
```

---

## 命名规范

### 基本原则
- 使用有意义的英文单词
- 采用驼峰命名法
- 避免使用单个字符（临时变量除外）
- 不使用Java关键字

### 具体规范
| 标识符类型 | 命名规则           | 示例                |
|------------|--------------------|---------------------|
| 类/接口    | 大驼峰（PascalCase）| `Student`, `CarFactory` |
| 方法/变量  | 小驼峰（camelCase） | `calculateTotal()`, `userName` |
| 常量       | 全大写+下划线      | `MAX_SIZE`, `PI` |
| 包名       | 全小写             | `com.example.project` |
| 布尔变量   | 以is/has/can开头   | `isValid`, `hasPermission` |

### 示例
```java
// 类名
public class EmployeeRecord {}

// 接口名
interface Drawable {}

// 方法名
public void calculateSalary() {}

// 变量名
int studentCount;

// 常量名
final double TAX_RATE = 0.08;
```

---

## 输入输出

### 标准输入
```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("请输入姓名: ");
        String name = scanner.nextLine();
        
        System.out.print("请输入年龄: ");
        int age = scanner.nextInt();
        
        System.out.println("你好，" + name + "! 你今年" + age + "岁。");
        
        scanner.close();  // 关闭Scanner
    }
}
```

### 格式化输出
```java
double price = 49.99;
int quantity = 5;
System.out.printf("总计: %.2f%n", price * quantity);  // 总计: 249.95
System.out.printf("日期: %tF%n", new java.util.Date());  // 日期: 2023-10-15
```

---

## 异常处理基础

```java
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("结果: " + result);
        } catch (ArithmeticException e) {
            System.err.println("错误: " + e.getMessage());
        } finally {
            System.out.println("程序执行完毕");
        }
    }
    
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("除数不能为零");
        }
        return a / b;
    }
}
```

**输出**:
```
错误: 除数不能为零
程序执行完毕
```

---

掌握了这些Java基础语法知识后，您已经具备了编写简单Java程序的能力。下一步可以学习面向对象编程（OOP）概念，如类、对象、继承、多态等核心特性。