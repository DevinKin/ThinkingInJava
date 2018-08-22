package exercise;

public class e4 {
    public static void main(String[] args) {
        int n = 100;
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if( i % j == 0) {
                    flag = false;
                    break;
                } else
                    flag = true;
            }

            if (flag) {
                System.out.println(i);
                flag = true;
            }
        }
    }
}
