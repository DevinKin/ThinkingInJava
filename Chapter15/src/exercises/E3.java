package exercises;

import generics.pets.Cat;
import generics.pets.Dog;
import generics.pets.Pet;
import generics.pets.Pug;

class Exercise<T> {
    private T a;
    private T b;
    private T c;

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public T getC() {
        return c;
    }

    public void setC(T c) {
        this.c = c;
    }

    public Exercise() {
        a = null;
        b = null;
        c = null;
    }

    public Exercise(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

public class E3 {
    public static void main(String[] args) {
        Exercise<Pet> eps = new Exercise<>();
        eps.setA(new Cat("cat"));
        eps.setB(new Dog("dog"));
        eps.setC(new Pug("pug"));
    }
}
