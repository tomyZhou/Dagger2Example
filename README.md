# Dagger2Example
知识点：

Inject

Component

Module

@Named("xx")

modules

dependencies

@Singleton

@ActivityScope (自定义Scope)

一个Module提供的对象的方法设置成单例，如果不同的Component引用这个Module，它得到的不是同一个对象。这时需要把提供单例对象的方法放在单独的component
的Module下面。

不同的Activity不能共用一个Component
