package generics;

public class Holder<T> {
    private T value;
    public Holder() {}
    public Holder(T val) {
        value = val;
    }

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> apple = new Holder<Apple>(new Apple());
        Apple d = apple.get();
        apple.set(d);
        // Cannot upcast
//        Holder<Fruit> fruitHolder = apple;
        Holder<? extends Fruit> fruit = apple;
        Fruit p = fruit.get();
        d = (Apple) fruit.get();
        try {
            Orange c = (Orange) fruit.get();
        } catch (Exception e) {
            System.out.println(e);
//            fruit.set(new Apple());
//            fruit.set(new Fruit());
            System.out.println(fruit.equals(d));
        }
    }
}
