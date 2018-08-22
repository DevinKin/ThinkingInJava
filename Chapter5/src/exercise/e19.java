package exercise;


class TestVarArgs {
    TestVarArgs(String... args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}

public class e19 {
    public static void main(String[] args) {
        new TestVarArgs("king","lala","kali");
    }
}
