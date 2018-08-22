package exercise;

public class e13 {
    public static void main(String[] args) {
        char c = '2';
        System.out.println(Integer.toBinaryString(toInt(c)));
    }

    public static int toInt(char c) {
        return (int)c;
    }
}
