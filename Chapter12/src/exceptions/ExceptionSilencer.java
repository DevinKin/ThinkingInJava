package exceptions;

import static net.mindview.util.Print.print;

public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();

        }
//    } catch (Exception e) {
//        print("RuntimeException()");

        finally {
            // Using 'return' inside the finally block
            // will silence any thrown exception
            System.out.println("finally");
            return;
        }
    }
}

