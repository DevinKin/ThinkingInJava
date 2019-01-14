# 第15章-泛型

## 泛型方法

- 泛型方法使得方法能够独立于类而产生变化。

### 一个通用的Generator

```java
public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;
    public BasicGenerator(Class<T> type) {
        this.type = type;
    }
    public T next() {
        // Assumes type is a public class:
        return type.newInstance();
    } catch(Exception e) {
        throw new RuntimeException(e);
    }
    // Produce a Default generator given a type token:
    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<T>(type);
    }
}
```

### 一个Set实用工具

```java
public class Sets {
    // 并集
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }
    // 交集
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }
    // 差集
    // Subtract subset from superset:
    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> result = new HashSet<T>(superset);
        result.removeAll(subset);
        return result;
    }
    // 非交集部分
    // Reflexive--everything not in the intersection:
    public static <T> Set<T> complement(Set<T> a , Set<T> b) {
        return difference(union(a,b), intersection(a,b));
    }
}
```

## 类型擦除的神秘之处

```java
package generics;

import java.util.ArrayList;

public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
}

//Output: true
```

- 在泛型代码内部，无法获得任何有关泛型参数类型的信息。
- Java泛型是通过类型擦除来实现的，这意味着当你在使用泛型时，任何具体的类型信息都被擦除了，唯一知道的是你在使用一个对象。

### 迁移兼容性

- 擦除的核心动机是它使得泛化的客户端可以用非泛化的类库来使用，反之亦然，这经常被称为“迁移兼容性”。

### 擦除的问题

- 擦除主要的正当理由是从非泛化代码到泛化代码的转变过程，以及在不破换现有类库的情况下，将泛型融入Java语言。
- 擦除使得现有的非泛型客户端代码能够在不改变的情况下继续使用，直至客户端准备好泛型重写这些代码。e
- 擦除的代价
  - 泛型不能用于显示地引用运行时类型的操作之中。如转型，instanceof操作和new表达式。因为所有关于参数的类型信息都丢失了。

### 边界处的动作

- 对于在泛型中创建数组，使用`Array.newInstance()`是推荐的方法。
- 泛型中的所有动作都发生在边界处，对传递进来的值进行额外的编译器检查，并插入对传递出去的值的转型。

## 擦除补偿

- 使用Class来获取运行时确切的类型信息。

  ```java
  package generics;
  
  class Building {}
  class House extends Building {}
  
  public class ClassTypeCapture<T> {
      Class<T> kind;
      public ClassTypeCapture(Class<T> kind) {
          this.kind = kind;
      }
      public boolean f(Object arg) {
          return kind.isInstance(arg);
      }
  
      public static void main(String[] args) {
          ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>(Building.class);
          System.out.println(ctt1.f(new Building()));
          System.out.println(ctt1.f(new House()));
          ClassTypeCapture<House> ctt2 = new ClassTypeCapture<>(House.class);
          System.out.println(ctt2.f(new Building()));
          System.out.println(ctt2.f(new House()));
      }
  }
  ```

### 创建类型示例

- 使用Class对象作为工厂对象

  ```java
  package generics;
  
  import static net.mindview.util.Print.print;
  
  class ClassAsFactory<T> {
      T x;
      public ClassAsFactory(Class<T> kind) {
          try {
              x = kind.newInstance();
          } catch (Exception e) {
              throw new RuntimeException(e);
          }
      }
  }
  class Employee {}
  
  public class InstantiateGenericType {
      public static void main(String[] args) {
          ClassAsFactory<Employee> fe = new ClassAsFactory<>(Employee.class);
          print("ClassAsFactory<Employee> succeeded");
          try {
              ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
          } catch (Exception e) {
              print("ClassAsFactory<Integer> failed");
          }
      }
  }
  ```

  - Integer没有任何默认的构造器，`ClassAsFactory<Integer>`失败。

- 使用显式的工厂，并将限制其类型。进行了编译器检查。

  ```java
  package generics;
  
  interface FactoryI<T> {
      T create();
  }
  
  class Foo2<T> {
      private T x;
      public <F extends FactoryI<T>> Foo2(F factory) {
          x = factory.create();
      }
  }
  
  class IntegerFactory implements FactoryI<Integer> {
      @Override
      public Integer create() {
          return new Integer(0);
      }
  }
  
  class Widget {
      public static class Factory implements FactoryI<Widget> {
          @Override
          public Widget create() {
              return new Widget();
          }
      }
  }
  public class FactoryConstraint {
      public static void main(String[] args) {
          new Foo2<Integer>(new IntegerFactory());
          new Foo2<Widget>(new Widget.Factory());
      }
  }
  ```

- 模板方法的设计模式。

  ```java
  package generics;
  
  abstract class GenericWithCreate<T> {
      final T element;
      GenericWithCreate() {
          element = create();
      }
      abstract T create();
  }
  
  class X {}
  
  class Creator extends GenericWithCreate<X> {
      @Override
      X create() {
          return new X();
      }
      void f() {
          System.out.println(element.getClass().getSimpleName());
      }
  }
  
  public class CreatorGeneric<T> {
      public static void main(String[] args) {
          Creator c = new Creator();
          c.f();
      }
  }
  ```

## 边界

- 边界使得在用于泛型的类型参数上设置限制条件。

- 因为擦除移除了类型信息，所以可以用无界泛型参数调用的方法只是那些可以用Object调用的方法。

- 如果能够将这个参数限制为某个类型自己，那么你就可以用这些类型子集来调用方法。

  ```java
  package generics;
  
  import java.awt.*;
  
  interface HasColor {
      java.awt.Color getColor();
  }
  
  class Colored<T extends HasColor> {
      T item;
      Colored(T item) {
          this.item = item;
      }
      T getItem() {
          return item;
      }
      // The bound allows you to call a method
      java.awt.Color color() {
          return item.getColor();
      }
  }
  
  class Dimension {
      public int x, y, z;
  }
  
  // This won't work -- class must be first, then interfaces:
  //class ColoredDemension<T extends HasColor & Dimension> {}
  
  // Multiple bounds:
  class ColoredDimension<T extends Dimension & HasColor> {
      T item;
      ColoredDimension(T item) {
          this.item = item;
      }
      T getItem() {
          return item;
      }
      java.awt.Color color() {
          return item.getColor();
      }
      int getX() {
          return item.x;
      }
      int getY() {
          return item.y;
      }
      int getZ() {
          return item.z;
      }
  }
  
  interface Weight {
      int weight();
  }
  
  // As with inheritance. you can have only one
  // concrete class but multiple interfaces:
  class Solid<T extends Dimension & HasColor & Weight> {
      T item;
      Solid(T item) {
          this.item = item;
      }
      T getItem() {
          return item;
      }
      java.awt.Color color() {
          return item.getColor();
      }
      int getX() {
          return item.x;
      }
      int getY() {
          return item.y;
      }
      int getZ() {
          return item.z;
      }
      int weight() {
          return item.weight();
      }
  }
  
  class Bounded extends Dimension implements HasColor, Weight {
  
      @Override
      public Color getColor() {
          return null;
      }
  
      @Override
      public int weight() {
          return 0;
      }
  }
  
  public class BasicBounds {
      public static void main(String[] args) {
          Solid<Bounded> solid = new Solid<>(new Bounded());
          solid.color();
          solid.getY();
          solid.weight();
      }
  }
  ```

  

## 通配符

```java
package generics;

import java.util.Arrays;
import java.util.List;

public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple)flist.get(0);
        flist.contains(new Apple());
        flist.indexOf(new Apple());
    }
}
```

### 逆变

- 超类型通配符：`<? super MyClass>`

  ```java
  package generics;
  
  import java.util.ArrayList;
  import java.util.List;
  
  public class GenericWriting {
      static <T> void writeExact(List<T> list, T item) {
          list.add(item);
      }
  
      static List<Apple> apples = new ArrayList<Apple>();
      static List<Fruit> fruits = new ArrayList<Fruit>();
      static void f1() {
          writeExact(apples, new Apple());
          writeExact(fruits, new Apple());
      }
  
      static <T> void writeWithWildcard(List<? super T> list, T item) {
          list.add(item);
      }
  
      static void f2() {
          writeWithWildcard(apples, new Apple());
          writeWithWildcard(fruits, new Apple());
      }
  
      public static void main(String[] args) {
          f1();
          f2();
      }
  }
  ```

### 无界通配符

- 无界通配符`<?>`

  ```java
  package generics;
  
  import java.util.ArrayList;
  import java.util.List;
  
  public class UnboundedWildcards1 {
      static List list1;
      static List<?> list2;
      static List<? extends Object> list3;
      static void assign1(List list) {
          list1 = list;
          list2 = list;
          list3 = list;
      }
      static void assign2(List<?> list) {
          list1 = list;
          list2 = list;
          list3 = list;
      }
      static void assign3(List<? extends Object> list) {
          list1 = list;
          list2 = list;
          list3 = list;
      }
  
      public static void main(String[] args) {
          assign1(new ArrayList());
          assign2(new ArrayList());
          assign3(new ArrayList());
          assign1(new ArrayList<String>());
          assign2(new ArrayList<String>());
          assign3(new ArrayList<String>());
          List<?> wildList =new ArrayList<>();
          assign1(wildList);
          assign2(wildList);
          assign3(wildList);
      }
  }
  ```

  