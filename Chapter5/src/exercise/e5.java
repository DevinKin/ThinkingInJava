package exercise;

class Dog {
    public void bark(int a) {
        System.out.println("Dog is howling");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class e5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(3);
    }
}
