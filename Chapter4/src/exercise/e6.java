package exercise;

public class e6 {
    static int test(int testval, int begin, int end) {
        if (testval >= begin && testval <= end)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(test(3,2,4));
        System.out.println(test(2,3,4));
    }
}
