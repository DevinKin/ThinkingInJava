package exercise;

class A extends C{

}

class B {

}

class C {
    private B b = new B();
}

public class e3 {
    public static void main(String[] args) {
        new C();
    }


}
