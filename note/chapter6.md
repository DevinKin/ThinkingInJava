# 访问权限控制的等级
1. 从大到小
    - public
    - protected
    - 包访问权限(没有关键字)
    - private
    
## 包访问权限
1. 某个类处在某个包中，当前包中所有其他类对那个成员都有访问权限，但对于包之外的所有类，这个成员却是private的

## public
1. public之后紧跟着的成员声明自己对每个人都是可用的

## private
1. 除了包括该成员的类以外，其他任何类都无法访问这个成员


## protect
1. 基类的protected成员可以被派生类所访问，而其他类(不在同一个包)不可以访问protected成员
2. protected也提供包访问权限，包内的其他类也可以访问protected元素


# 接口和实现
1. 访问权限的控制常被称为是具体实现的隐藏。把数据和方法包装进类中，以及具体实现的隐藏，常共同被称作是封装。


# 类的访问权限
1. 每个编译单元(文件)都只能有一个public类

2. 类既不可以是private的，也不可以是protected的。(除了内部类)

3. 对于类的访问权限，仅有报访问权限和public