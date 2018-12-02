package typeinfo;

import typeinfo.interfacea.A;

import java.lang.reflect.InvocationTargetException;

import static net.mindview.util.Print.print;

class InnerA {
    private static class C implements A {
        @Override
        public void f() {
            print("public C.f()");
        }

        public void g() {
            print("public C.g()");
        }
        void u() {
            print("package C.u()");
        }

        protected void v() {
            print("protected C.v()");
        }

        private void w() {
            print("private C.w()");
        }
    }
    public static A makeA() {
        return new C();
    }
}

public class InnerImplementation {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        A a = InnerA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        // Reflection still gets into the private class:
        HiddenImplementation.callHiddenMethod(a, "g");
        HiddenImplementation.callHiddenMethod(a, "u");
        HiddenImplementation.callHiddenMethod(a, "v");
        HiddenImplementation.callHiddenMethod(a, "w");
    }
}
