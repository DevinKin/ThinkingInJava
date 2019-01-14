package exercises;

import generics.Fibonacci;
import net.mindview.util.Generator;

import java.util.Iterator;

public class IterableFibonacci implements Iterable<Integer>{
    private Generator<Integer> generator = new Fibonacci();
    private int n;


    public IterableFibonacci() {
    }

    public IterableFibonacci(int n) {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return generator.next();
            }
        };
    }

    public static void main(String[] args) {
        for (int i : new IterableFibonacci(18)) {
            System.out.print(i + " ");
        }
    }
}
