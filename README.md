# JAVA设计模式

## 创建型模式

### [单例模式(Singleton pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/singleton)
确保一个类只有一个实例，并提供全局访问。

#### 防止单例模式被反射攻击
* 构造器在被要求创建第二个实例时抛出异常([SyncSingleton](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/singleton/effective/refelct/attack/SyncSingleton.java))
* 用枚举类写单例模式([EnumSingleton](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/singleton/effective/refelct/attack/EnumSingleton.java))

***

### [工厂模式(Factory pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/factory)
定义了一个创建对象的接口，工厂方法决定接口由哪个子类实例化。

***

### [建造者模式(Builder pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/builder)
封装一个产品的构造过程，并允许按步骤构造. 将一个复杂对象的构建与它的实现分离, 使得同样的构建过程可以创建不同的实现。

#### 构成
主要由两部分构成：一个部分是部件构造和产品装配，另一个部分是整体构建的算法。

#### 适用
1. 当创建复杂对象的算法应该独立于该对象的组成部分
2. 当构造过程必须允许被构造的对象有不同的表示

#### 参与者
* 产品([SoccerTeam](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/builder/model/SoccerTeam.java)) - 被构造的复杂对象
* 抽象建造者([SoccerTeamBuilder](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/builder/builder/SoccerTeamBuilder.java)) - 一个抽象接口来规范产品对象的各个部件的建造
* 具体建造者([RealMadridBuilder](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/builder/builder/impl/RealMadridBuilder.java)) - 抽象建造者的实现类，构造产品和装配产品的各个部件
* 导演者([SoccerTeamDirector](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/builder/SoccerTeamDirector.java)) - 调用具体建造者来创建产品对象

***

### [原型模式(Prototype pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/prototype)
当创建给定类的实例过程很昂贵或很复杂时, 就使用原形模式，复制原型对象创建出更多同类型的对象。

#### 复制概念
* 浅复制：基本数据类型的变量都会重新创建，引用类型还是原对象所指向的
* 深复制：无论基本数据类型还是引用类型都重新创建

***

## 结构型模式

### [适配器模式(Adapter pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/adapter)
将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题。

#### 分类
* 类的适配器模式 - [ClassAdapter](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/adapter/ClassAdapter.java)
* 对象的适配器模式 - [ObjectAdapter](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/adapter/ObjectAdapter.java)
* 接口的适配器模式 - [InterfaceAdapter](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/adapter/InterfaceAdapter.java)

类的适配器模式和对象的适配器模式类似，将目标类和目标接口的功能扩展到接口中。<br/>
接口的适配器模式主要用来解决，我们写的接口有多个抽象方法，但我们写的接口并不想实现所有的方法，<br/>
这是需要借助一个抽象类，该抽象类实现类所有的方法。我们可以继承该抽象类，重写我们需要的方法就行。

***

### [装饰者模式(Decorator pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/decorator)
动态的给一个对象增加一些新功能(提供了比继承更有弹性的替代方案)，要求装饰对象和被装饰对象实现同一个接口。

#### 适用
* 需要扩展类的功能。

#### 优缺点
* 优点：动态的给对象增加功能，而且还能撤销(继承无法做到，继承的功能是静态的，不能动态增删)。
* 缺点：会产生过多相似的对象，不易排错。

***

### [代理模式(Proxy pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/proxy)
为另一个对象提供一个替身以控制对这个对象的访问。

#### 适用
如果已有的方法在使用的时候需要对原有的方法进行改进，就可以采用代理模式。如果直接修改，违反了软件开发的“对扩展开放，对修改关闭”原则。

#### 和装饰者模式的区别
* 装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。
* 使用代理模式，代理和真实对象之间的的关系通常在编译时就已经确定了(关系在代理类new的时候就已确定)，<br/>
而装饰者能够在运行时被构造(关系在new装饰器类时候传入构造方法)。

***

### [外观模式(Facade pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/facade)
外观模式是为了解决类与类之间的依赖关系，将他们的关系放在一个Facade类[Computer类](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/facade/Computer.java)中，降低了类与类之间的耦合度。

***

### [桥接模式(Bridge pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/bridge)
把事物和其具体实现分开，使他们可以各自独立的变化。将抽象化与实现化解耦，使得二者可以独立变化(类似jdbc切换数据库基本上不用改什么代码就能自由切换)。

#### 示例代码关系图
![bridge-pattern](http://oi5y1stl0.bkt.clouddn.com/bridge-pattern.png)

***

### [组合模式(Composite pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/composite)
允许你将对象组合成树形结构来表现"整体/部分"层次结构。

#### 适用
将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。

***

### [亨元模式(Flyweight Pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/flyweight)
实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用。

代码示例，通过连接池的管理，实现了数据库连接的共享，不需要每一次都重新创建连接，节省了数据库重新创建的开销，提升了系统的性能。

***

## 行为型模式

### [策略模式(Strategy pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/strategy)
定义了算法族, 分别封闭起来, 让它们之间可以互相替换,且算法的变化不会影响到使用算法的客户。<br/>
策略模式的决定权在用户，系统本身提供不同算法的实现，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。

#### 和桥接模式的关系
和策略模式相比，桥接模式要表达的内容要更多，结构也更加复杂。桥接模式表达的主要意义其实是接口隔离的原则，<br/>
即把本质上并不内聚的两种体系区别开来，使得它们可以松散的组合，而策略在解耦上还仅仅是某一个算法的层次，没有到体系这一层次。<br/>
策略的结构是包容在桥接结构中的，桥接中必然存在着策略模式，[Bridge](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/bridge/Bridge.java)与[DataBase](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/bridge/db/DataBase.java)之间就可以认为是策略模式，<br/>
但是桥接模式一般[DataBase](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/bridge/db/DataBase.java)将提供一系列的成体系的操作，而且[DataBase](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/bridge/db/DataBase.java)是具有状态和数据的静态结构。而且桥接模式[Bridge](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/bridge/Bridge.java)也可以独立变化。

***

### [模板方法模式(Template pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/template)
一个抽象类中，有一个主方法，再定义n个方法，可以是抽象的，也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类的主方法，实现对子类方法实现的调用。

***

### [观察者模式(Observer pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/observer)
在对象之间定义一对多的依赖, 当一个对象改变状态, 依赖它的对象都会收到通知, 并自动更新。

***

### [迭代器模式(Iterator pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/iterator)
提供一种方法顺序访问一个聚合对象中的各个元素, 而又不暴露其内部结构。

***

### [责任链模式(Chain of responsibility pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/chain)
通过责任链模式, 你可以为某个请求创建一个对象链。每个对象依序检查此请求并对其进行处理或者将它传给链中的下一个对象。<br/>
责任链模式可以实现，在隐瞒客户端的情况下，对系统进行动态的调整。<br/>
链接上的请求可以是一条链，可以是一个树，还可以是一个环，模式本身不约束这个；同时，在一个时刻，命令只允许由一个对象传给另一个对象，而不允许传给多个对象。

***

### [命令模式(Command pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/command)
将"请求"封闭成对象, 以便使用不同的请求,队列或者日志来参数化其他对象。命令模式的目的就是达到命令的发出者和执行者之间解耦，实现请求和执行分开。

***

### [备忘录模式(Memento pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/memento)
保存一个对象的某个状态，以便在适当的时候恢复对象。

***

### [状态模式(State pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/state)
当对象的状态改变时，同时改变其行为。

***

### [访问者模式(Visitor pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/visitor)
访问者模式把数据结构和作用于结构上的操作解耦合，使得操作集合可相对自由地演化。访问者模式适用于数据结构相对稳定算法又易变化的系统。<br/>
简单来说，访问者模式就是一种分离对象数据结构与行为的方法，通过这种分离，可达到为一个被访问者[MySubject](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/visitor/MySubject.java)动态添加新的操作而无需做其它的修改的效果。

***

### [中介者模式(Mediator pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/mediator)
使用中介者模式来集中相关对象之间复杂的沟通和控制方式，用来降低类类之间的耦合的。<br/>
如果类类之间有依赖关系的话，不利于功能的拓展和维护，因为只要修改一个对象，其它关联的对象都得进行修改。<br/>
如果使用中介者模式，只需关心和[Mediator](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/mediator/MyMediator.java)类的关系，具体类类之间的关系及调度交给[Mediator](https://github.com/wanglingfeng/java-design-patterns/blob/master/src/main/java/com/joseph/mediator/MyMediator.java)就行。

***

### [解释器模式(Interpreter pattern)](https://github.com/wanglingfeng/java-design-patterns/tree/master/src/main/java/com/joseph/interpreter)
使用解释器模式为语言创建解释器，解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等。

***

## 设计模式的七大设计原则
### 单一职责原则【SINGLE RESPONSIBILITY PRINCIPLE】
一个类负责一项职责。
### 里氏替换原则【LISKOV SUBSTITUTION PRINCIPLE】
继承与派生的规则。
### 依赖倒置原则【DEPENDENCE INVERSION PRINCIPLE】
高层模块不应该依赖低层模块，二者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象。即针对接口编程，不要针对实现编程。
### 接口隔离原则【INTERFACE SEGREGATION PRINCIPLE】
建立单一接口，不要建立庞大臃肿的接口，尽量细化接口，接口中的方法尽量少。
### 迪米特法则【LOW OF DEMETER】
低耦合，高内聚。
### 开闭原则【OPEN CLOSE PRINCIPLE】
一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。
### 组合/聚合复用原则【Composition/Aggregation Reuse Principle(CARP)】
尽量使用组合和聚合少使用继承的关系来达到复用的原则。