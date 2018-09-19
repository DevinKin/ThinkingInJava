1. 不可以用返回值来区分重载方法

2. static方法的内部不能调用非静态的方法

3. static方法是没有this的方法


# 清理，终结处理和垃圾回收
1. Java允许类中定义一个名为`finalize()`的方法

2. finalize()方法的工作原理
    - 一旦垃圾回收器准备好释放对象占用的存储空间，将首先调用其finalize()方法，并且在下一次垃圾回收动作发生时，才会真正回收对象占用的内存。
    
3. 对象可能不被垃圾回收

4. 垃圾回收并不等于“析构”

5. finalize()方法的用途
    1. 垃圾回收只与内存有关
    2. finalize()方法可以释放通过某种创建对象方式以外的方式为对象分配的存储空间
    3. 在gc回收对象之前调用该方法
    
# static关键字
1. static关键字不能应用于局部变量，因此它只能作用于域。

2. 如果一个域是静态的基本类型域，也没有初始化，那么它就会获得基本类型的标准初值。

3. 如果是对象引用，那么它的默认初始值是null