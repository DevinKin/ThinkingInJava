package exercise;

class E1{
    String str;
}

public class e1 {
    public static void main(String[] args) {
        E1 e1 = new E1();
        if (e1.str != null) {
            System.out.println("not null");
        } else {
            System.out.println("null");
        }
    }
}
