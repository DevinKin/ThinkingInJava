package polymorphism;

/**
 * @author devinkin
 * <p>Title: PrivateOverride</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 7:53 2018/9/21
 */

import static net.mindview.util.Print.*;

public class PrivateOverride {
    private void f() {
        print("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() {
        print("public f()");
    }
}
