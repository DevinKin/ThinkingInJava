package interfaces;


interface I1 {
    void f();
}

interface I2 {
    void f();
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}

class C2 implements I1, I2 {

    @Override
    public void f() {

    }
}

//class C3 extends C implements I2 {
//
//}



public class InterfaceCollision {


}
