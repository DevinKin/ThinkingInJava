# 存储数据的5个地方
1. 寄存器
    1. 最快的存储区，位于处理器内部
2. 堆栈
    1. 位于通用RAM(随机访问存储器)，通过堆栈指针可以从处理器那里获得直接支持
3. 堆
    1. 一种通用的内存池(位于RAM区)，用于存放所有的Java对象 
4. 常量存储
    1. 常量值通常直接存放在程序代码内部
5. 非RAM存储
    1. 存活在程序之外，不受程序的任何控制，在程序没有运行时也可以存在
    2. 常用于流对象和持久化对象


# 基本类型
1. 创建基本类型变量直接存储值，并置于堆栈中，因此更加高效。

## Java基本类型
|基本类型|大小|最小值|最大值|包装器类型|
-------|----|-----|-----|---------|
|boolean|-|-|-|Boolean|
|char|16-bit|Unicode o|Unicode 2^16-1|Character|
|byte|8bits|-12^8|+127|Byte|
|short|16bits|-2^15|+2^15-1|Short|
|int|32bits|-2^31|+2^31-1|Integer|
|long|64bits|-2^63|+2^63-1|Long|
|float|32bits|IEE754|IEE754|Float|
|double|64bits|IEE754|IEE754|Double|
|void|-|-|-|Void|

# 类的基本成员默认值
|基本类型|默认值|
|--|--|
|boolean|false|
|char|'\u0000'(null)|
|byte|(byte)0|
|short|(short)0|
|int|0|
|long|oL|
|float|0.0f|
|double|0.0d|

# 方法
1. 格式
```java
ReturnType methodName(/*Argument list*/) {
    /* Method body */
}
```
2. 方法名和参数列表合称方法签名

# javadoc注释
1. javadoc命令只能在`/**`注释中出现，结束于`*/`

2. javadoc只能为public和protected成员进行文档注释，private和包内可访问成员的注释会被忽略掉，可以用`-private`进行标记，以便把private成员的注释也包括在内

## javadoc的部分标签
|标签|格式|说明|
|--|--|--|
|@see|<table><tr><td>@see classname</td></tr><tr><td>@see full-qualified-classname</td></tr><tr><td>@see full-qualified-classname#method-name</td></tr></table>|引用其他类|
|@link|@link package.class#member label|作用于行内，类似与@see，作为超链接文本而不用"See Also"|
|@version|@version version-information|版本信息|
|@author|@author author-information|作者信息|
|@since|@since version|允许你指定程序代码最早使用的版本|
|@param|@parma parameter-name description|方法参数描述|
|@return|@return description|方法返回值描述|
|@throws|@throws fully-qualified-class-name description|方法调用可能抛出异常的异常描述|
|@deprecated|@deprecated|支出一些旧特性已由改进的新特性取代，方法标注此标签，会引起编译器发布警告|


