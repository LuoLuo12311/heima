# Java 学习笔记

## 类的命名规范

1. **使用大驼峰命名法（UpperCamelCase）**
   - 示例：`UserService`, `StudentController`

2. **类名应为名词或名词短语**
   - 示例：`User`, `Order`, `PaymentProcessor`

3. **避免使用缩写**
   - 使用完整单词，如 `Internationalization` 而不是 `Intl`

4. **接口命名可以使用形容词或形容词短语**
   - 示例：`Serializable`, `Comparable`

5. **抽象类命名通常以 `Abstract` 开头**
   - 示例：`AbstractService`, `AbstractDao`

6. **异常类命名应以 `Exception` 结尾**
   - 示例：`InvalidInputException`, `ResourceNotFoundException`

7. **测试类命名通常与被测试类相关，并以 `Test` 结尾**
   - 示例：`UserServiceTest`, `UserControllerTest`

8. **工具类命名通常以 `Util` 或 `Utils` 结尾**
   - 示例：`StringUtils`, `DateUtils`

9. **常量类命名通常以 `Constants` 结尾**
   - 示例：`AppConstants`, `SystemConstants`

10. **遵循项目和团队的约定**
    - 保持一致性，避免多种风格混用

### 示例
- 正确命名：`UserRepository`, `OrderService`, `PaymentGateway`
- 错误命名：`user_repository`, `order_service`, `payment-gateway`

---

## 包的命名规则

1. **基础命名规范**
   - 全部小写字母
   - 使用英文单词，避免拼音或中文字符
   - 不使用特殊字符和数字开头

2. **反向域名约定**
   - 国内企业常用公司域名作为包名前缀，例如：
     - 公司域名：`example.com`
     - 包名前缀：`com.example`
   - 示例：`com.alibaba.projectname.module`, `org.companyname.product.department`

3. **模块化分层命名**
   - 每一级表示不同的模块或功能区域
   - 示例：`com.companyname.product.department.feature.subfeature`

4. **常用命名层级建议
   | 层级 | 含义 | 示例 |
   |------|------|------|
   | `com` | 组织类型（商业机构） | `com` |
   | `companyname` | 公司名称或品牌 | `taobao`, `jd` |
   | `product` | 产品或系统名称 | `oms`, `payment` |
   | `module` | 模块或子系统 | `order`, `user`, `inventory` |
   | `layer` | 分层结构（如 controller、service、dao 等） | `controller`, `service`, `repository`, `dto`, `util` |

5. **国内企业典型命名示例**
```java
// 阿里系
com.alibaba.ecommerce.order.service;
com.taobao.infrastructure.cache;

// 腾讯系
com.tencent.payment.gateway;
com.qq.usermanagement.controller;

// 华为系
com.huawei.device.manager.util;
com.huaweicloud.datacenter.monitoring;

// 京东系
com.jd.finance.report.dao;
```

6. **团队内部命名建议**
   - 保持一致性
   - 清晰表达业务含义
   - 避免过长嵌套

7. **注意事项**
   - 不要使用 JDK 已有包名，如 `java.util`, `javax.servlet` 等
   - 避免使用单字母包名，除非是临时测试代码
   - 避免使用保留关键字，如 `default`, `int`, `goto` 等