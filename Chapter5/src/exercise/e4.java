package exercise;

class Test4 {
    Test4() {
        System.out.println("test4 created");
    }

    Test4(String msg) {
        System.out.println("test4 created " + msg);
    }
}

public class e4 {
    public static void main(String[] args) {
        Test4 test4 = new Test4();
        Test4 test41 = new Test4("hello");
    }

}
