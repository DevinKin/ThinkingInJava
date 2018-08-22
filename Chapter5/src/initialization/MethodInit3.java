package initialization;

public class MethodInit3 {

//    int j = g(i); Illegal forward referenc
    int i = f();
    int f() { return 11; }
    int g(int n) { return n*10; }
}
