# Java数组详解

> 本文专为Java初学者设计，全面讲解数组的基本概念、使用方法和常见操作

## 一、数组的概念
**数组(Array)** 是Java中用于存储**相同类型**数据的**连续内存空间**的数据结构

### 核心特点：
- **固定长度**：数组一旦创建，其长度不可改变
- **索引访问**：通过索引（从0开始）访问数组元素
- **类型统一**：数组中所有元素必须是相同数据类型
- **内存连续**：数组元素在内存中是连续存储的

## 二、数组的声明与初始化

### 1. 声明数组
```java
// 推荐方式：数据类型[] 数组名;
int[] numbers;
String[] names;

// 传统方式（不推荐）：数据类型 数组名[];
double heights[];
```

### 2. 初始化数组
#### (1) 静态初始化（直接指定元素）
```java
// 完整格式
int[] arr1 = new int[]{1, 2, 3, 4, 5};

// 简化格式（常用）
int[] arr2 = {10, 20, 30};
String[] fruits = {"Apple", "Banana", "Orange"};
```

#### (2) 动态初始化（指定长度）
```java
// 创建长度为5的int数组（默认值0）
int[] scores = new int[5]; 

// 创建长度为3的String数组（默认值null）
String[] students = new String[3]; 
```

### 3. 数组默认值
| 数据类型   | 默认值     |
|------------|------------|
| `byte`     | 0          |
| `short`    | 0          |
| `int`      | 0          |
| `long`     | 0L         |
| `float`    | 0.0f       |
| `double`   | 0.0d       |
| `char`     | '\u0000'   |
| `boolean`  | false      |
| 引用类型    | null       |

## 三、数组的基本操作

### 1. 访问数组元素
```java
int[] numbers = {10, 20, 30, 40, 50};

// 获取索引为2的元素（第3个元素）
int third = numbers[2];  // 30

// 修改索引为3的元素
numbers[3] = 100;  // {10, 20, 30, 100, 50}
```

### 2. 获取数组长度
```java
String[] names = {"Alice", "Bob", "Charlie"};
int length = names.length;  // 3
```

### 3. 数组遍历
#### (1) 使用for循环
```java
int[] arr = {1, 2, 3, 4, 5};

for (int i = 0; i < arr.length; i++) {
    System.out.println("索引 " + i + ": " + arr[i]);
}
```

#### (2) 使用增强for循环（foreach）
```java
String[] colors = {"Red", "Green", "Blue"};

for (String color : colors) {
    System.out.println(color);
}
```

## 四、多维数组

### 1. 二维数组声明与初始化
```java
// 静态初始化
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// 动态初始化
double[][] scores = new double[3][4];  // 3行4列
```

### 2. 二维数组遍历
```java
int[][] grid = {
    {1, 2},
    {3, 4, 5},
    {6}
};

for (int i = 0; i < grid.length; i++) {
    for (int j = 0; j < grid[i].length; j++) {
        System.out.print(grid[i][j] + " ");
    }
    System.out.println();
}
```

## 五、数组常见操作

### 1. 数组复制
```java
int[] source = {1, 2, 3, 4, 5};
int[] dest = new int[5];

// 使用System.arraycopy()
System.arraycopy(source, 0, dest, 0, source.length);

// 使用Arrays.copyOf()
int[] copy = Arrays.copyOf(source, source.length);
```

### 2. 数组排序
```java
int[] numbers = {5, 3, 9, 1, 7};

// 使用Arrays.sort()升序排序
Arrays.sort(numbers);  // {1, 3, 5, 7, 9}
```

### 3. 数组查找
```java
int[] data = {10, 20, 30, 40, 50};

// 顺序查找
int target = 30;
for (int i = 0; i < data.length; i++) {
    if (data[i] == target) {
        System.out.println("找到元素，索引：" + i);
        break;
    }
}

// 二分查找（要求数组已排序）
int index = Arrays.binarySearch(data, 30);  // 返回2
```

## 六、数组使用注意事项

1. **索引越界**：访问不存在的索引会抛出`ArrayIndexOutOfBoundsException`
   ```java
   int[] arr = new int[3];
   arr[3] = 10;  // 错误！最大索引为2
   ```

2. **空指针异常**：未初始化的数组使用会抛出`NullPointerException`
   ```java
   int[] arr;
   System.out.println(arr[0]);  // 错误！数组未初始化
   ```

3. **长度固定**：数组创建后长度不可变，需变长时考虑使用`ArrayList`

4. **内存占用**：大型数组可能占用较多内存，注意合理设计

## 七、数组与内存

### 内存分配示意图：
```
栈内存(stack)         堆内存(heap)
+--------------+     +-------------------+
| 数组引用变量   | --> | 数组对象(连续空间)  |
| (如: arr)     |     | [0][1][2][3]...  |
+--------------+     +-------------------+
```

## 八、数组应用场景

1. 存储一组相关数据（如学生成绩）
2. 实现基础数据结构（栈、队列）
3. 矩阵运算
4. 排序和搜索算法实现
5. 作为方法的参数和返回值

```java
// 示例：计算数组平均值
public static double average(int[] nums) {
    if (nums == null || nums.length == 0) {
        return 0.0;
    }
    
    int sum = 0;
    for (int num : nums) {
        sum += num;
    }
    return (double) sum / nums.length;
}
```

> 掌握数组是Java编程的基础，建议多练习数组相关算法题目来巩固知识！