package exceptions;

class ThreeException extends Exception {}

public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                // Post-increment is zero first time:
                if (count++ == 0) {
                    throw new ThreeException();
                }
            } catch (ThreeException e) {
                e.printStackTrace();
            } finally {
                System.out.println("In finally clause");
                if (count == 2)
                    // out of "while
                    break;
            }
        }
    }
}
