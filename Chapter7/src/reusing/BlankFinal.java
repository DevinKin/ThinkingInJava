package reusing;

/**
 * @author devinkin
 * <p>Title: </p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 23:06 2018/9/19
 */

class Poppet {
    private int i;
    Poppet(int i1) {i = i1;}
}

public class BlankFinal {
    // Initialized final
    private final int i = 0;
    // Blank final
    private final  int j;
    // Blank final reference
    private final Poppet p;

    // Blank finals MUST be initialized in the constructor:
    public BlankFinal() {
        // Initialize blank final
        j = 1;
        // Initialize blank final reference
        p = new Poppet(1);
    }

    public BlankFinal(int x) {
        // Initialize blank final
        j = x;
        // Initialize blank final reference
        p = new Poppet(x);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }


}
