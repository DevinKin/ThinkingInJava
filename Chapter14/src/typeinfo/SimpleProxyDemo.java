package typeinfo;

import static net.mindview.util.Print.print;

interface Interface {
    void doSomthing();
    void somethingElse(String arg);
}

class RealObject implements Interface {
    @Override
    public void doSomthing() {
        print("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        print("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;
    private static int counter = 0;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomthing() {
        print("SimpleProxy doSomething");
        counter++;
        print("call method " + counter + " times. ");
        proxied.doSomthing();
    }

    @Override
    public void somethingElse(String arg) {
        print("SimpleProxy somthingElse " + arg);
        counter++;
        print("call method " + counter + " times. ");
        proxied.somethingElse(arg);
    }
}


public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomthing();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
