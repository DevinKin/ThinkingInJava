# 第14章-类型信息

## Class对象

- Class对象就是用来创建类的所有"常规对象的".
- 所有的类都是在其第一次使用时,动态加载到JVM中.当程序创建第一个类的静态成员的引用时,就会加载这个类.说明构造器也是类的静态方法.
- $Class.forName()$方法时静态方法,取得Class对象的引用的一种方法
  - 它是一个包含目标类的文本名的String作为参数,返回的是一个Class对象的引用.
  - 参数必须为类的全限定名.
  - 如果类没有被加载就加载它.
- 想在运行时使用类型信息,就必须首先获得对恰当**Class对象的引用**.
- $Class.geSimpleName()$获得类名
- $Class.getName()$获得类的全限定的类名
- $Class.getCanonicalName()$获得不包含包名的类名和全限定的类名
- $Class.getSupperClass()$获取class引用的直接基类.
- $Class.newInstance()$创建类对象,该类必须带有默认的构造器.

### 类字面常量

- 使用类字面常量生成对Class对象的引用: `FancyToy.class`
- 使用`.class`来创建对Class对象的引用时, 不会自动地初始化该Class对象. 
- 为了使用类会做三个步骤:
  - 加载, 由类加载器执行. 该步骤找到字节码, 并从字节码中创建一个Class对象.
  - 链接, 在链接阶段将验证类中的字节码, 为静态域分配存储空间.
  - 初始化. 如果该类具有超类, 则对其初始化, 执行静态初始化器和静态初始化块.

- 如果一个`static final`值是编译器常量, 那么这个值不需要对该类进行初始化就可以被读取.

- 如果一个static域不是final的, 那么在对它访问时, 总是要求在它被读取之前, 要先进行链接(为这个域分配存储空间)和初始化(初始化该存储空间).

  ```java
  package typeinfo;
  
  import java.util.Random;
  
  class Initable {
      static final int staticFinal = 47;
      static final int staticFinal2 =
              ClassInitialization.rand.nextInt(1000);
      static {
          System.out.println("Initializing Initable");
      }
  }
  
  class Initable2 {
      static int staticNonFinal = 147;
      static {
          System.out.println("Initializing Initable2");
      }
  }
  
  class Initable3 {
      static int staticNonFinal = 74;
      static {
          System.out.println("Initializing Initable3");
      }
  }
  
  public class ClassInitialization {
      public static Random rand = new Random(47);
  
      public static void main(String[] args) throws ClassNotFoundException {
          Class initable = Initable.class;
          System.out.println("After creating Initable ref");
          // Does not trigger initialization:
          System.out.println(Initable.staticFinal);
          // Does trigger initialization:
          System.out.println(Initable.staticFinal2);
          // Does trigger initialization:
          System.out.println(Initable2.staticNonFinal);
          Class initable3 = Class.forName("typeinfo.Initable3");
          System.out.println("After creating Initable3 ref");
          System.out.println(Initable3.staticNonFinal);
      }
  }
  ```

### 泛化的Class引用

- 使用通配符`?`可以在使用泛化的Class引用时放松限制. 通配符`?`表示"任何事物".
  - `Class<? extend xxx>`表示某个类, 它是xxx的子类.
  - `Class<? super xxx>`表示某个类, 它是xxx的父类.

### 新的转型语法

- `Class.cast()`方法接受参数对象, 并将其转型为Class引用的类型.

  ```java
  package typeinfo;
  
  class Building {}
  class House extends Building {}
  
  public class ClassCasts {
      public static void main(String[] args) {
          Building b = new House();
          Class<House> houseType = House.class;
          House h = houseType.cast(b);
          // or just do this
          h = (House) b;
      }
  }
  ```

## 反射: 运行时的类信息

- RTTI和反射的区别
  - 对RTTI来说, 编译器在编译时打开和检查`.class`文件.
  - 对反射机制来说, `.class`文件在编译时时不可获取的, 所以是在运行时打开和检查`.class`文件.

## 动态代理

- `Proxy.newProxyInstance()`静态方法可以创建动态代理, 这个方法需要的参数为

  - 一个类加载器.
  - 一个被代理对象的接口列表.
  - InvocationHandler接口的一个实现.

- 动态代理可以将所有调用重定向到处理器, 因此通常会向处理器的构造器传递一个"实际"对象的引用. 从而使得调用处理器在执行其中介任务时, 可以请求转发.

  ```java
  package typeinfo;
  
  import java.lang.reflect.InvocationHandler;
  import java.lang.reflect.Method;
  import java.lang.reflect.Proxy;
  
  import static net.mindview.util.Print.print;
  
  class MethodSelector implements InvocationHandler {
      private Object proxied;
  
      public MethodSelector(Object proxied) {
          this.proxied = proxied;
      }
  
      @Override
      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
          if (method.getName().equals("interesting")) {
              print("Proxy detected the interesting method");
          }
          return method.invoke(proxied, args);
      }
  }
  
  interface SomeMethods {
      void boring1();
      void boring2();
      void interesting(String arg);
      void boring3();
  }
  
  class Implementation implements SomeMethods {
  
      @Override
      public void boring1() {
          print("boring1");
      }
  
      @Override
      public void boring2() {
          print("boring2");
      }
  
  
      @Override
      public void interesting(String arg) {
          print("interesting " + arg);
      }
  
      @Override
      public void boring3() {
          print("boring3");
      }
  }
  
  public class SelectingMethods {
      public static void main(String[] args) {
          SomeMethods proxy = (SomeMethods) Proxy.newProxyInstance(
                  SomeMethods.class.getClassLoader(),
                  new Class[] {SomeMethods.class},
                  new MethodSelector(new Implementation())
          );
          proxy.boring1();
          proxy.boring2();
          proxy.interesting("bonobo");
          proxy.boring3();
      }
  }
  ```



