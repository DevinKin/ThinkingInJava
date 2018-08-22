package test;

public class test6 {
    public static int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        String s = "devinkin";
        System.out.println(storage(s));
    }
}
