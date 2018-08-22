package exercise;

class test10 {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("prepared to garbage collection");
        super.finalize();
    }
}

public class e10 {
    public static void main(String[] args) {
        // Proper cleanup
        test10 t1 = new test10();

        // Drop the reference.
        new test10();
        // Force garbe collection & finalization
        System.gc();
    }
}
