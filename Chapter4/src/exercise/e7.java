package exercise;

public class e7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 99) {
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i++) {
            if (i == 99) {
                System.out.println(i);
                return;
            }
            System.out.println(i);
        }
    }
}
