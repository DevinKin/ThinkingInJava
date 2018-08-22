package exercise;

public class e12 {
    public static void main(String[] args) {
        int num = 0xffffffff;
        int length = Integer.toBinaryString(num).length() / 2;
        System.out.println("toLeft");
        for (int i = 0; i < length; i++) {
            System.out.println(Integer.toBinaryString(num));
            num <<= 1;
        }
        System.out.println("toRight");
        for (int i = 0; i < 2*length; i++) {
            num >>>= 1;
            System.out.println(Integer.toBinaryString(num));
        }
    }
}
