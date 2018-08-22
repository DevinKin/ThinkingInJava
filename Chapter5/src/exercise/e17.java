package exercise;


class E17test {
    E17test(String str) {
        System.out.println(str);
    }
}

public class e17 {
    public static void main(String[] args) {
        E17test[] e17tests = new E17test[] {
                new E17test("kali"),
                new E17test("lala"),
                new E17test("kal"),
        };
    }
}
