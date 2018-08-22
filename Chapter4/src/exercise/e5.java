package exercise;

public class e5 {
    public static void main(String[] args) {
        int n = -19;
        getByteType(n);
    }

    public static void getByteType(int n) {
        StringBuilder sb = new StringBuilder("");
        do {
            if ((n & 1) == 1) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            n >>>= 1;
        }
        while (n > 0);
        System.out.println(sb.reverse());
    }
}
