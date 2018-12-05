# DesignPattern(设计模式)

>设计模式（Design Pattern）是一套被反复使用、多数人知晓的、经过分类的、代码设计经验的总结。

使用设计模式的目的：为了代码可重用性、让代码更容易被他人理解、保证代码可靠性。 设计模式使代码编写真正工程化；设计模式是软件工程的基石脉络，如同大厦的结构一样。

---

## 代理模式

>代理(Proxy)是一种设计模式,提供了对目标对象另外的访问方式;即通过代理对象访问目标对象.这样做的好处是:可以在目标对象实现的基础上,增强额外的功能操作,即扩展目标对象的功能.
这里使用到编程中的一个思想:不要随意去修改别人已经写好的代码或者方法,如果需改修改,可以通过代理的方式来扩展该方法

举个例子来说明代理的作用:假设我们想邀请一位明星,那么并不是直接联系明星,而是联系明星的经纪人,来达到同样的目的.明星就是一个目标对象,他只要负责活动中的节目,而其他琐碎的事情就交给他的代理人(经纪人)来解决.这就是代理思想在现实中的一个例子

代理模式的关键点是:代理对象与目标对象.代理对象是对目标对象的扩展,并会调用目标对象；

### 静态代理

静态代理在使用时,需要定义接口或者父类,被代理对象与代理对象一起实现相同的接口或者是继承相同父类.

下面举个案例来解释:
模拟保存动作,定义一个保存动作的接口:IUserDao.java,然后目标对象实现这个接口的方法UserDao.java,此时如果使用静态代理方式,就需要在代理对象(UserDaoProxy.java)中也实现IUserDao接口.调用的时候通过调用代理对象的方法来调用目标对象.
需要注意的是,代理对象与目标对象要实现相同的接口,然后通过调用相同的方法来调用目标对象的方法

静态代理总结:
1.可以做到在不修改目标对象的功能前提下,对目标功能扩展.
2.缺点:

因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
如何解决静态代理中的缺点呢?答案是可以使用动态代理方式

### 动态代理

动态代理有以下特点:
1.代理对象,不需要实现接口
2.代理对象的生成,是利用JDK的API,动态的在内存中构建代理对象(需要我们指定创建代理对象/目标对象实现的接口的类型)
3.动态代理也叫做:JDK代理,接口代理

JDK中生成代理对象的API
代理类所在包:java.lang.reflect.Proxy
JDK实现代理只需要使用newProxyInstance方法,但是该方法需要接收三个参数,完整的写法是:
static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h )
注意该方法是在Proxy类中是静态方法,且接收的三个参数依次为:

ClassLoader loader,:指定当前目标对象使用类加载器,获取加载器的方法是固定的
Class<?>[] interfaces,:目标对象实现的接口的类型,使用泛型方式确认类型
InvocationHandler h:事件处理,执行目标对象的方法时,会触发事件处理器的方法,会把当前执行目标对象的方法作为参数传入

总结:
代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理

### Cglib代理

上面的静态代理和动态代理模式都是要求目标对象是实现一个接口的目标对象,但是有时候目标对象只是一个单独的对象,并没有实现任何的接口,这个时候就可以使用以目标对象子类的方式类实现代理,这种方法就叫做:Cglib代理

Cglib代理,也叫作子类代理,它是在内存中构建一个子类对象从而实现对目标对象功能的扩展.

JDK的动态代理有一个限制,就是使用动态代理的对象必须实现一个或多个接口,如果想代理没有实现接口的类,就可以使用Cglib实现.
Cglib是一个强大的高性能的代码生成包,它可以在运行期扩展java类与实现java接口.它广泛的被许多AOP的框架使用,例如Spring AOP和synaop,为他们提供方法的interception(拦截)
Cglib包的底层是通过使用一个小而块的字节码处理框架ASM来转换字节码并生成新的类.不鼓励直接使用ASM,因为它要求你必须对JVM内部结构包括class文件的格式和指令集都很熟悉.
Cglib子类代理实现方法:
1.需要引入cglib的jar文件,但是Spring的核心包中已经包括了Cglib功能,所以直接引入pring-core-3.2.5.jar即可.
2.引入功能包后,就可以在内存中动态构建子类
3.代理的类不能为final,否则报错
4.目标对象的方法如果为final/static,那么就不会被拦截,即不会执行目标对象额外的业务方法.

在Spring的AOP编程中:
如果加入容器的目标对象有实现接口,用JDK代理
如果目标对象没有实现接口,用Cglib代理

## 策略模式(Strategy Pattern)

**策略模式**定义了算法族（行为），分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于使用算法的客户。

以“复用”为目的而使用继承是不可取的，缺点是：维护时难以改变，牵一发动全身。

**设计原则：**

1. 找出应用中可能需要变化之处，把他们独立出来，不要和那些不需要变化的代码混在一起。

2. 针对接口编程，而不是针对实现编程。

3. 多用组合，少用继承。

## 观察者模式(Observer Pattern)

> 让你的对象知悉现状，出版者+订阅者=观察者模式

**观察者模式**定义了对象之间一对多的依赖，这样一来，当一个对象改变状态时，他的所有依赖者都会收到通知并自动更新。观察者模式提供了一种对象设计，让主题和观察者之间松耦合。

**设计原则：**

1. 为交互对象之间的松耦合设计而努力。

**要点：**

- 观察者模式定义了对象之间一对多的关系

- 主题（也就是观察者）用一个共同的接口来更新观察者

- 观察者和可观察者之间用松耦合方式结合，可观察者不知道观察者的细节，只知道观察者实现了观察者接口。

- 使用此模式时，你可以从被观察者处推（push）或者拉（pull）数据（然而，推的方式被认为更“正确”）。

有多个观察者时，不可以依赖特定的通知次序。

- Java有多种观察者模式的实现，包括了通用的java.util.Observable。

- 要注意java.util.Observable实现上所带来的一些问题。

- 如果有必要的话，可以实现自己的Observable,这并不难，不要害怕。

- Swing大量使用 观察者模式，许多GUI框架也是如此。

- 此模式也被应用在许多地方，例如：JavaBeans、RMI。

## 装饰者模式(Decorator Pattern)

**装饰者模式**动态的将责任附加到对象上。想要扩展功能，装饰者提供了有别于继承的另一种选择。

**设计原则：**

1. 开放关闭原则（类应该对扩展开放，对修改关闭）。

**要点：**

- 继承属于扩展形式之一，但不见得是达到弹性设计的最佳方式。

- 在我们的设计中，应该允许行为可以被扩展，而无须修改现有的代码。

- 组合和委托可用于在运行时动态地加上新的行为。

- 除了继承，装饰者模式也可以让我们扩展行为。

- 装饰者模式意味着一群装饰者类，这些类用来包装具体组件。

- 装饰者类反映出被装饰的组件类型（事实上，他们具有相同的类型，都经过接口或继承实现）。

- 装饰者可以在被装饰者的行为前面与/或后面加上自己的行为，甚至将被装饰者的行为整个取代掉，而达到特定的目的。

- 你可以用无数个装饰者包装一个组件。

- 装饰者一般对组件的客户是透明的,除非客户程序依赖于组件的具体类型。

- 装饰者会导致设计中出现许多小对象，如果过度使用，会让程序变得很复杂。

## 工厂模式(Factory Pattern)

**简单工厂：** 简单工厂实际不是一个设计模式，反而比较像是一种编程习惯。将“创建对象的代码”提取出来封装到另一个对象中，该对象就是一个简单工厂。

**工厂方法模式：** 工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。

**设计原则：**

1. 依赖倒置原则：要依赖抽象，不要依赖具体类。

**抽象工厂模式：** 提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。

**要点：**

- 所有的工厂都是用来封装对象的创建。

- 简单工厂，虽然不是真正的设计模式，但是仍不失为一个简单的方法，可以将客户程序从具体类中解耦。

- 工厂方法使用继承：把对象的创建委托给子类，子类实现工厂方法来创建对象。

- 抽象工厂使用对象组合：对象的创建被实现在工厂接口所暴露出来的方法中。

- 所有工厂模式都通过减少应用程序和具体类之间的依赖促进松耦合。

- 工厂方法允许类将实例化延迟到子类进行。

- 抽象工厂创建相关的对象家族，而不需要依赖它们的具体类。

- 依赖倒置原则，指导我们避免依赖具体类型，而要尽量依赖抽象。

- 工厂是很有威力的技巧，帮助我们针对抽象编程，而不是要针对具体类编程。

