package exercise;

class Dog {
    String name;
    String says;
}

public class e5 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "spot";
        d1.says = "Ruff!";
        Dog d2 = new Dog();
        d2.name = "scruffy";
        d2.says = "Wurf!";
        System.out.println(d1 == d2);
        System.out.println(d1.equals(d2));
    }
}
