package generics;

import net.mindview.util.FiveTuple;
import net.mindview.util.FourTuple;
import net.mindview.util.ThreeTuple;
import net.mindview.util.TwoTuple;

import static net.mindview.util.Tuple.tuple;

class Amphibian {

}

class Vehicle {

}

class SixTuple<A,B,C,D,E,F> {
    private final A a;
    private final B b;
    private final C c;
    private final D d;
    private final E e;
    private final F f;

    public SixTuple(A a, B b, C c, D d, E e, F f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    @Override
    public String toString() {
        return "SixTuple{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                ", f=" + f +
                '}';
    }
}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }
    static TwoTuple<String, Integer> f2() {
        return tuple("hi", 47);
    }
    static ThreeTuple<Amphibian, String, Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }
    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }

    static SixTuple<Amphibian, Vehicle, String, Integer, Double,Float> l() {
        return new SixTuple<>(new Amphibian(), new Vehicle(), "hi", 12, 12.3, 13.2f);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(l());
    }
}
