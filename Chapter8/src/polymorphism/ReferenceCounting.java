package polymorphism;

import static net.mindview.util.Print.print;

/**
 * @author devinkin
 * <p>Title: ReferenceCounting</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 8:37 2018/9/21
 */

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        print("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            print("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }

    public long getRefCount() {
        return refcount;
    }

    @Override
    protected void finalize() throws Throwable {
        if (--refcount != 0) {
            return;
        } else {
            super.finalize();
        }
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        print("disposing " + this);
        shared.dispose();
        try {
            finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        if (shared.getRefCount() != 0) {
            System.out.println("finalize not now,refcount not zero");
        } else {
            System.out.println("finalize now, refcount is zero");
        }
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {new Composing(shared), new Composing(shared),
          new Composing(shared), new Composing(shared),new Composing(shared)
        };
        for (Composing c : composings) {
            c.dispose();
        }
        System.gc();
    }
}
