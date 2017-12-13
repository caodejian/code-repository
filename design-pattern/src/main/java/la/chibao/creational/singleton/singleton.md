#单例模式

顾名思义，在jvm中只存在一个实例对象，并提供全局访问点。

1、懒汉模式

顾名思义，实例初始化，在调用get方法时才创建，但是这样会造成线程并发问题，多个线程同时调用会创建多个实例的情况，顾还需要加同步锁，我个人认为得不偿失。
并发又有两种方式，分为synchronized方法，synchronized代码块（需要非空双重校验）两种方式。
    

2、饿汉模式

顾名思义，单例在类初始化时构建，结构简单，没有并发问题，推荐使用这种结构。

3、spring ioc方式

不限制原始对象创建，在spring容器内，通过spring配置实现是否单例，spring默认单例模式。