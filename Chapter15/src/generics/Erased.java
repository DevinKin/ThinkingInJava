package generics;

public class Erased<T> {
    private final int SIZE = 100;
    public void f(Object arg) {
//        if (arg instanceof  T) {}   // Error
//        T var = new T();            // ERROR
//        T[] array = new T[SIZE];      // ERROR
//        T[] array = new Object[SIZE]; // Unchecked warning
    }
}
