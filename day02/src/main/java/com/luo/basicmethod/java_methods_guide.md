## 🔄 方法重载（Overload）
> 💡 同一类中允许存在多个同名方法，通过参数列表区分

### ✅ 定义规则
1. **方法名必须相同**
2. **参数列表必须不同**（参数个数、类型或顺序不同）
3. **返回值类型可以不同**（但不能单独依靠返回值类型区分）

### 🧩 使用场景
| 场景 | 示例 |
|------|------|
| **统一接口** | `print(int), print(String)` 统一打印接口 |
| **功能扩展** | `add(int, int), add(int, int, int)` 不同参数个数 |
| **类型适配** | `draw(Shape), draw(Circle)` 参数类型不同 |

### ⚠️ 注意事项
1. **不能仅通过返回值类型区分**
   ```java
   // 编译错误 ❌
   public int calculate() { return 42; }
   public double calculate() { return 42.0; } // 仅返回值不同
   ```

2. **参数顺序不同也算重载**
   ```java
   // 合法重载 ✅
   public void show(int a, String b) {}
   public void show(String b, int a) {}
   ```

3. **访问权限可以不同**
   ```java
   // 合法定义 ✅
   public void process() {}
   private void process(int flag) {}
   ```

4. **与继承关系处理**
   - 子类重载父类方法时，访问权限不能更严格
   - 可以通过 `@Override` 注解明确覆盖关系

## 🚫 void 方法中 return 的特殊用法
> 💡 在无返回值方法中，return 用于流程控制而非返回数据

### ✅ 核心作用
1. **提前终止方法执行**
   ```java
   public void checkAge(int age) {
       if (age < 0) {
           System.out.println("年龄不能为负数");
           return; // 遇到非法参数立即终止方法
       }
       // 正常业务逻辑
   }
   ```

2. **强制结束方法调用**
   ```java
   public void processTask(boolean isReady) {
       if (!isReady) {
           System.out.println("任务未就绪");
           return; // 满足条件直接结束方法
       }
       // 执行耗时操作
   }
   ```

### ⚠️ 使用限制
- **不能携带返回值**
  ```java
  // 编译错误 ❌
  public void showError() {
      return "错误信息"; // void 方法不能返回值
  }
  ```

- **非必需语法元素**
  ```java
  // 合法定义 ✅
  public void sayHello() {
      System.out.println("Hello World!");
      // 可以没有 return 语句
  }
  ```

### 🧠 使用场景
| 场景 | 示例 |
|------|------|
| **参数校验** | 遇到非法参数提前终止 |
| **流程控制** | 满足条件跳过后续逻辑 |
| **调试辅助** | 临时屏蔽部分代码 |
| **循环中断** | 在循环中配合 break 使用 |

### ✅ 最佳实践
1. **保持单一出口原则**（非强制）
2. **配合日志输出**：return 前打印关键信息
3. **避免过度使用**：多个 return 会降低可读性
4. **与异常处理区别**：严重错误应使用异常机制

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
5. **练习方法重载**：尝试为同一个功能实现多种参数版本
6. **理解 return 机制**：掌握 void 方法的流程控制方式

> 💡 提示：所有方法都必须定义在类中，Java 没有全局函数的概念