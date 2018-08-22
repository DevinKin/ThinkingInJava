package exercise;

public class e11 {
    public static void main(String[] args) {
        int num = 0x80000000;
        do {
            System.out.println(Integer.toBinaryString(num));
            num>>>=1;
        }
        while (num != 0);
    }
}
