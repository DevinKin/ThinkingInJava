package exercise;


public class e2 {
    public static void main(String[] args) {
        int arr[] = new int[25];
        for (int i = 0; i < 25; i++) {
            arr[i] = (int) (Math.random() * 15);
        }
        for (int i = 0; i < 24; i++) {
            int next = arr[i + 1];
            if (arr[i] > next) {
                System.out.println("bigger than next number");
            } else if (arr[i] < next) {
                System.out.println("less than next number");
            } else {
                System.out.println("equal");
            }
        }
    }
}
