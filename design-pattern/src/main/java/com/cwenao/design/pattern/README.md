# 设计模式 [参考blog][1]
---
## 面向对象设计原则
### 一、 单一职责原则 (Single Responsibility Principle, SRP)
  - There should never be more than one reason for a class to change（应该只有一个引起类变化的原因）
  - 单一职责原则主要为实现高内聚、低耦合
### 二、里氏替换原则（Liskov Substitution Principle LSP）
  - What is wanted here is something like the following substitution property: If for each object o1 of type S there is an object o2 of type T such that for all programs P defined in terms of T, the behavior of P is unchanged when o1 is substituted for o2 then S is a subtype of T
  （任何基类可以出现的地方，子类一定可以出现）

### 三、依赖倒置原则  (Dependence Inversion Principle, DIP )
  - High level modules should not depend upon low level modules. Both should depend upon abstractions. Abstractions should not depend upon details. Details should depend upon abstractions
  (高层模块不应该依赖低层模块，两者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象)
  - 使用接口或抽象类进行变量类型、参数类型、方法返回类型声明，以及数据类型的转换

### 四、接口隔离原则(Interface Segregation Principle, ISP)
 - Clients should not be forced to depend upon interfaces that they don't use.(客户端不应该依赖它不需要的接口)。
 - The dependcy of one class to another one should depend on the smallest possible interface.(类间的依赖关系应该建立在最小的接口上)

### 五、合成复用原则(Composite Reuse Principle, CRP)
  - 在一个新的对象里通过关联关系（包括组合关系和聚合关系）来使用一些已有的对象，使之成为新对象的一部分；新对象通过委派调用已有对象的方法达到复用功能的目的
  - 复用时要尽量使用组合/聚合关系（关联关系），少用继承

### 六、迪米特法则（Law of Demeter, LoD）
  - 一个软件实体应当尽可能少地与其他实体发生相互作用
    - 对象最接近互动实体
      - 当前对象本身(this)；
      - 以参数形式传入到当前对象方法中的对象；
      - 当前对象的成员对象；
      - 如果当前对象的成员对象是一个集合，那么集合中的元素也都是朋友；
      - 当前对象所创建的对象

### 七、开闭原则（Open Closed Principle, OCP)
  - Software entities like classes, modules and functions should be open for extension but closed for modifications
    - 一个软件实体：如类、模块和函数应该对扩展开放，对修改关闭。

---
## 创建者模式
### 一、简单工厂
 [参考blog文章simple factory][2]
- 只提供一个工厂类
- 缺点
  - 与【开闭原则】相悖：需要知道具体的每个产品的对象，修改时需要修改代码

![简单工厂](http://bimg.kakme.com/markdown-img-paste-20171201111926302.png)

### 二、工厂方法 [参考文章][3]
- 不再提供一个统一的工厂类来创建所有的产品对象，而是针对不同的产品提供不同的工厂，系统提供一个与产品等级结构对应的工厂等级结构
  - 结构图
    ![结构图](http://bimg.kakme.com/markdown-img-paste-20171206065225107.png)
  - 在工厂方法模式结构图中包含如下几个角色：
       ● Product（抽象产品）：它是定义产品的接口，是工厂方法模式所创建对象的超类型，也就是产品对象的公共父类。
       ● ConcreteProduct（具体产品）：它实现了抽象产品接口，某种类型的具体产品由专门的具体工厂创建，具体工厂和具体产品之间一一对应。
       ● Factory（抽象工厂）：在抽象工厂类中，声明了工厂方法(Factory Method)，用于返回一个产品。抽象工厂是工厂方法模式的核心，所有创建对象的工厂类都必须实现该接口。
       ● ConcreteFactory（具体工厂）：它是抽象工厂类的子类，实现了抽象工厂中定义的工厂方法，并可由客户端调用，返回一个具体产品类的实例。
  - 如果对客户端隐藏则将LoggerFactory改为 abstract
  - ![日志记录结构图](http://bimg.kakme.com/markdown-img-paste-2017120606560116.png)

### IoDH
- Initialization Demand Holder (IoDH)

[1]: http://blog.csdn.net/lovelion/article/details/17517213 "design pattern"
[2]: http://blog.csdn.net/lovelion/article/details/9300657 "simple factory"
[3]: http://blog.csdn.net/lovelion/article/details/9306745 "factory pattern"
