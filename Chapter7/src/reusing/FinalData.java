package reusing;

import java.util.Random;
import static net.mindview.util.Print.*;

/**
 * @author devinkin
 * <p>Title: </p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 22:49 2018/9/19
 */

class Value {
    int i;
    public Value(int i) { this.i = i;}
}

public class FinalData {
    private static Random random = new Random(47);
    private String id;
    public FinalData(String id) {
        this.id = id;
    }
    // Can be compile-time-constants:
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    // Typical public constant:
    public static final int VALUE_THREE = 39;
    // Cannot be compile-time constants:
    private final int i4 = random.nextInt(20);
    static final int INT_5 = random.nextInt(20);

    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    // Arrays:
    private final int[] a = {1, 2, 3, 4, 5, 6};

    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        //! fd1.valueOne++; // Error: can't change value
        FinalData fd1 = new FinalData("fd1");
        // Object isn't constant:
        fd1.v2.i++;
        // OK, not final
        fd1.v1 = new Value(0);
        for (int i = 0; i < fd1.a.length; i++) {
            // Object isn't constant:
            fd1.a[i]++;
        }
        //! fd1.v2 = new Value(0) //Error: Can't
        //! fd1.VAL_3 = new Value(1); // change reference
        //! fd1.a = new int[3];
        print(fd1);
        print("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        print(fd1);
        print(fd2);
    }
}
