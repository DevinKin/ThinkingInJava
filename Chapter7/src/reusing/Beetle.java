package reusing;
import static net.mindview.util.Print.*;

/**
 * @author devinkin
 * <p>Title: </p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 23:36 2018/9/19
 */

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        print(s);
        return 47;
    }
}

public class Beetle extends Insect{
    private int k = printInit("Bettle.k initialized");
    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }

    private static int x = printInit("static Bettle.x2 initialized");

    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b = new Beetle();
    }
}
