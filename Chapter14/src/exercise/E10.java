package exercise;

public class E10 {
    public static void main(String[] args) {
        char[] chars = new char[3];
        Class charClass = chars.getClass();
        System.out.println(charClass.getName());
        System.out.println(charClass.getSimpleName());
        System.out.println(charClass.getSuperclass());
    }
}
