package exercise;

public class e3 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 15);
        while (true) {
            int m = (int) (Math.random() * 15);

            System.out.printf("m: %d, n: %d\n", m, n);
            if (n > m) {
                System.out.println("bigger than next number");
            } else if (n < m) {
                System.out.println("less than next number");
            } else {
                System.out.println("equal");
            }
            n = m;
        }
    }
}
