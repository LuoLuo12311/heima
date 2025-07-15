# Java 方法详解

## 📌 什么是方法？
方法（Method）是封装特定功能的代码块，可通过方法名重复调用。是 Java 程序的基本组成单元。

```java
// 示例：定义一个打印方法
public static void printMessage() {
    System.out.println("Hello from method!");
}
```

## 🧱 方法定义语法
```java
[访问修饰符] [其他修饰符] 返回值类型 方法名([参数列表]) {
    // 方法体
    return [返回值]; // 非void方法必须返回对应类型值
}
```

### 组成要素说明
| 组成部分 | 说明 |
|----------|------|
| **访问修饰符** | `public/private/protected` 控制访问权限 |
| **其他修饰符** | `static/final/abstract` 等（可选） |
| **返回值类型** | `void` 表示无返回值，否则需匹配返回值类型 |
| **方法名** | 遵循大驼峰命名法（UpperCamelCase） |
| **参数列表** | 多个参数需指定类型，逗号分隔（形参） |

## ⚠️ 语法注意事项
1. **参数必须声明类型**
   ```java
   // 正确
   public void show(int a, String b) {}
   // 错误 ❌
   public void show(a, b) {} // 未声明参数类型
   ```

2. **方法不能嵌套定义**
   ```java
   // 错误 ❌
   public void outer() {
       public void inner() {} // 不允许嵌套方法
   }
   ```

3. **返回值必须匹配**
   ```java
   // 正确
   public int calculate() {
       return 42;
   }
   // 错误 ❌
   public int calculate() {
       return "text"; // 类型不匹配
   }
   ```

4. **方法签名唯一性**
   方法名+参数列表（参数数量、类型顺序）必须唯一

## 📁 方法定义位置
- **必须定义在类内部**
- **不能定义在其他方法内部**（与 C/C++ 不同）
- **位置不影响调用顺序**（与 C 不同）

```java
public class Example {
    // main方法可以放在任何位置
    public static void main(String[] args) {
        sayHello(); // 可以调用下方定义的方法
    }

    // 方法定义顺序不影响调用
    public static void sayHello() {
        System.out.println("Hello!");
    }
}
```

## 🚀 方法调用方式

### 1. **无返回值方法调用**
```java
printMessage(); // 直接调用
// 或者通过类名调用（静态方法）
ClassName.printMessage();
```

### 2. **有返回值方法调用**
```java
int result = add(5, 3);
System.out.println("结果：" + result);
```

### 3. **参数传递机制**
- **基本类型**：值传递（拷贝副本）
- **引用类型**：地址传递（操作同一对象）

```java
// 值传递示例
public void changeValue(int x) {
    x = 100;
}

// 调用后值不变
int a = 10;
changeValue(a); // a仍为10
```

## 📘 方法调用完整示例
```java
public class MethodDemo {
    public static void main(String[] args) {
        // 调用静态方法
        printHeader();
        
        // 创建对象调用实例方法
        MethodDemo demo = new MethodDemo();
        int sum = demo.addNumbers(5, 8);
        System.out.println("Sum: " + sum);
    }

    // 静态方法定义
    public static void printHeader() {
        System.out.println("===== 计算开始 =====");
    }

    // 实例方法定义
    public int addNumbers(int a, int b) {
        return a + b;
    }
}
```

## ✅ 学习建议
1. **先从 static 方法开始**：避免对象创建的复杂度
2. **用 main 方法测试**：通过 `main` 方法验证其他方法功能
3. **逐步理解栈内存**：方法调用时的内存分配机制
4. **掌握调试技巧**：使用 IDEA 的 Step Into(F7) 观察执行流程

> 💡 提示：所有方法都必须定义在类中，Java 没有全局函数的概念