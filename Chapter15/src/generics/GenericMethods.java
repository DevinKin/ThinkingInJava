package generics;

public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public <A,B,C> void f(A a, B b, C c) {
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
        System.out.println("=======================test====================");
        gm.f("",1,gm);
    }
}
