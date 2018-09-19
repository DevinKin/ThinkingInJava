package reusing;

/**
 * @author devinkin
 * <p>Title: </p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 23:13 2018/9/19
 */

class Gizmo {
    public void spin() {}
}

public class FinalArguments {
    void width(final Gizmo g) {
        //! g = new Gizmo();
    }

    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }

    // void f(final int i) { i++; } // Can't change
    // You can only read from a final primitive:
    int g(final int i) { return i + 1;}

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.without(null);
    }
}


