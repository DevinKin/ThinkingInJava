package test;

public class test7 {
    public static void main(String[] args) {
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
}

class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() { StaticTest.i++;}
}
