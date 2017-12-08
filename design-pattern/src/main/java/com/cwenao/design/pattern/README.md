# 设计模式
## 创建者模式
### 一、简单工厂
 [参考blog文章simple factory][1]
- 只提供一个工厂类
- 缺点
  - 与【开闭原则】相悖：需要知道具体的每个产品的对象，修改时需要修改代码

![简单工厂](http://bimg.kakme.com/markdown-img-paste-20171201111926302.png)

### 二、工厂方法 [参考文章][2]
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

[1]: http://blog.csdn.net/lovelion/article/details/9300657 "simple factory"
[2]: http://blog.csdn.net/lovelion/article/details/9306745 "factory pattern"
