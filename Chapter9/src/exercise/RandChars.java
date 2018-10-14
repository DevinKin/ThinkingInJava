package exercise;

import java.util.Random;

public class RandChars {
    private static Random random = new Random(47);

    private static final String chars = "abacadsflakdjflkqwejer.a,smdf.alsdkfpoeia[rkqwe/mz.c,mz/as ,/as.d,f [k oqewrk;.";

    public char next() {
        return chars.charAt(random.nextInt(chars.length()));
    }

    public static void main(String[] args) {
        RandChars randChars = new RandChars();

        for (int i = 0; i < 7; i++) {
            System.out.println(randChars.next());
        }
    }
}
