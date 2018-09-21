package polymorphism;

/**
 * @author devinkin
 * <p>Title: RTTI</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 9:35 2018/9/21
 */

class Useful {
    public void f() {}
    public void g() {}
}

class MoreUseful extends Useful {
    @Override
    public void f() {
    }

    @Override
    public void g() {
    }

    public void u() {}

    public void v() {}

    public void w() {}
}

public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[1].g();
        // Compile time: method not found in Useful;
        //! x[1].u();
        // Downcast/RTTI
        ((MoreUseful)x[1]).u();
        // Exception thrown
        ((MoreUseful)x[0]).u();
    }
}
