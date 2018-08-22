package initialization;

import java.util.Arrays;
import java.util.Random;

import static net.mindview.util.Print.print;

public class ArrayClassObject {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] a = new Integer[random.nextInt(20)];
        print("length of a =" + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(500);
        }
        print(Arrays.toString(a));
    }
}
