package generics;


import com.sun.jmx.remote.internal.ArrayQueue;
import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;
import net.mindview.util.Generator;

import java.util.*;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> List<T> fill(List<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> Queue<T> fill(Queue<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> Set<T> fill(Set<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffees) {
            System.out.println(c);
        }
        Collection<Integer> fnumbers = fill(new ArrayList<>(), new Fibonacci(), 12);
        for (int i : fnumbers) {
            System.out.print(i + ", ");
        }
        System.out.println();

        List<Integer> fnumbers2 = fill(new ArrayList<>(), new Fibonacci(), 12);
        for (int i : fnumbers2) {
            System.out.print(i + ", ");
        }
        System.out.println();

        Queue<Integer> fnumbers3 = fill(new PriorityQueue<>(), new Fibonacci(), 12);
        for (int i : fnumbers3) {
            System.out.print(i + ", ");
        }
        System.out.println();

        Set<Integer> fnumbers4 = fill(new HashSet<>(), new Fibonacci(), 12);
        for (int i : fnumbers4) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
