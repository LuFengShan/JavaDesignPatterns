# 单例模式
Singleton Pattern提供了一种在应用程序上下文中仅实例化一个实例的方法。

## 创建单例模式的思想：
- 创建Singleton类的私有静态变量。这是Singleton类的唯一实例。
- 创建构造函数是私有的，以确保外部类不能实例化对象形式Singleton Class。
- 为获取Singleton实例创建一个全局方法。

## 单例的几种模式
> * 1.饿汉模式`实例将在类加载时创建`
> * 2.静态代码块模式`和饿汉模式加载时机相同`
> * 3.懒汉模式`实例将在第一次使用的时候加载`
> * 4.**线程安全单例模式** `推荐使用双重检查机制的单例实现`
> * 5.Bill Pugh Singleton模式
> * 6.**枚举单例模式**`强烈推荐使用`

##表格与指定的类
| 模式                    | 类                   |
| :---------------------- | -------------------- |
| 饿汉模式                | EagerSingleton       |
| 静态代码块模式          | StaticBlockSingleton |
| 懒汉模式                | LazySingleton        |
| 线程安全单例模式        | ThreadSafeSingleton  |
| Bill Pugh Singleton模式 | BillPughSingleton    |
| 枚举模式                | EnumSingleton        |

