package generics;

public class Holder3<T> {
    private T a;
    public Holder3(T a) {
        this.a = a;
    }
    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<>(new Automobile());
        // No cast needed
        Automobile a = h3.get();
        // h3.set("Not an Automobile");     // No cast needed
        // h3.set(1);                       // Error
    }
}
