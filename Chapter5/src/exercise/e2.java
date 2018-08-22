package exercise;

class E2 {
    String str = "str";

    E2 () {
        str = "construct str";
    }
}

public class e2 {
    public static void main(String[] args) {
        E2 e2 = new E2();
        System.out.println(e2.str);
    }
}
