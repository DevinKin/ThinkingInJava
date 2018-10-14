package exercise;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandChars extends RandChars implements Readable{

    private int count;

    public AdaptedRandChars(int count) {
        this.count = count;
    }


    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }

        String result = next() + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandChars(7));
        while (s.hasNext()) {
            System.out.print(s.next() + " ");
        }
    }
}
