package exercise;

class Flo {
    float f;
}

public class e3 {
    static void c(Flo y) {
        y.f = 13.5f;
    }

    public static void main(String[] args) {
        Flo x = new Flo();
        x.f = 12.5f;
        System.out.println("1: x.f: " + x.f);
        c(x);
        System.out.println("2: x.f: " + x.f);
    }
}
