package operators;

import org.junit.Test;

public class AllOps {
    //To accept the results of a boolean test:
    void f(boolean b) { }
    void boolTest(boolean x, boolean y) {
        // arithmetic operators:
        //! x = x * y
        //! x = x / y
        //! x = x % y
        //! x = x + y
        //! x = x - y
        //! x++;
        //! x--;
        //! x = + y;
        //! x = - y;
        //Relational and logical:
        //! f(x > y)
        //! f(x >= y)
        //! f(x < y)
        //! f(x <= y)
        f (x==y);
        f (x!=y);
        f(!y);
        x = x && y;
        x = x || y;
        //Bitwise operators:
        //! x = -y
        x = x & y;
        x = x | y;
        x = x ^ y;
        //! x = x << 1;
        //! x = x >> 1;
        //! x = x >>> 1;
        //Compound assignment;
        //! x += y;
        //! x -= y;
        //! x *= y;
        //! x /= y;
        //! x %= y;
        //! x <<= 1;
        //! x >>= 1;
        //! x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        //Casting:
        //! char c = (char) x;
        //! byte b = (byte) x;
        //! short s = (short) x;
        //! int i = (int) x;
        //! long l = (long) x;
        //! float f = (float) x;
        //! double f = (double) x;
    }

    void charaTest(char x, char y) {
        //Arithmethic operators:
        x = (char)(x * y);
        x = (char)(x / y);
        x = (char)(x % y);
        x = (char)(x + y);
        x = (char)(x - y);
        x++;
        x--;
        x = (char) + y;
        x = (char) - y;
        //relational an logical:
        f (x > y);
        f (x >= y);
        f (x < y);
        f (x <= y);
        f (x == y);
        f (x != y);
        //! f(!x)
        //! f(x && y)
        //! f(x || y)
        //Bitwise operators:
        x = (char)~y;
        x = (char)(x & y);
        x = (char)(x | y);
        x = (char)(x ^ y);
        x = (char)(x << 1);
        x = (char)(x >> 1);
        x = (char)(x >>> 1);
        //Compound assignment:
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        //Casting:
        //! boolean b1 = (boolean) x;
        byte b = (byte) x;
        short s = (short) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
    }

    void byteTest(byte x, byte y) {
        // Aritmethic operators:
        x = (byte)(x * y);
        x = (byte)(x / y);
        x = (byte)(x % y);
        x = (byte)(x + y);
        x = (byte)(x - y);
        x++;
        y--;
        x = (byte)+ y;
        x = (byte)- y;
        //Relational and logical:
        f (x > y);
        f (x >= y);
        f (x < y);
        f (x <= y);
        f (x == y);
        f (x != y);
        //! f(!x)
        //! f(x && y)
        //! f(x || y)
        //Bitwise operators:
        x = (byte)~y;
        x = (byte)(x & y);
        x = (byte)(x | y);
        x = (byte)(x ^ y);
        x = (byte)(x << 1);
        x = (byte)(x >> 1);
        x = (byte)(x >>> 1);
        //Conpound assignment:
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;
        //Casting:
        //! boolean b1 = (booolean)x;
        char c = (char) x;
        short s = (short) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
    }

    void shortTest(short x, short y) {
        // Aritmethic operators:
        x = (short)(x * y);
        x = (short)(x / y);
        x = (short)(x % y);
        x = (short)(x + y);
        x = (short)(x - y);
        x++;
        y--;
        x = (short)+ y;
        x = (short)- y;
        //Relational and logical:
        f (x > y);
        f (x >= y);
        f (x < y);
        f (x <= y);
        f (x == y);
        f (x != y);
        //! f(!x)
        //! f(x && y)
        //! f(x || y)
        //Bitwise operators:
        x = (short)~y;
        x = (short)(x & y);
        x = (short)(x | y);
        x = (short)(x ^ y);
        x = (short)(x << 1);
        x = (short)(x >> 1);
        x = (short)(x >>> 1);
        //Conpound assignment:
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;
        //Casting:
        //! boolean b1 = (booolean)x;
        char c = (char) x;
        byte s = (byte) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
    }

    void intTest(int x, int y) {
        // Aritmethic operators:
        x = x * y;
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        y--;
        x = + y;
        x = - y;
        //Relational and logical:
        f (x > y);
        f (x >= y);
        f (x < y);
        f (x <= y);
        f (x == y);
        f (x != y);
        //! f(!x)
        //! f(x && y)
        //! f(x || y)
        //Bitwise operators:
        x = ~y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        x = x << 1;
        x = x >> 1;
        x = x >>> 1;
        //Conpound assignment:
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;
        //Casting:
        //! boolean b1 = (booolean)x;
        char c = (char) x;
        byte i = (byte) x;
        short s = (short) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
    }

    void longTest(long x, long y) {
        // Aritmethic operators:
        x = x * y;
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        y--;
        x = + y;
        x = - y;
        //Relational and logical:
        f (x > y);
        f (x >= y);
        f (x < y);
        f (x <= y);
        f (x == y);
        f (x != y);
        //! f(!x)
        //! f(x && y)
        //! f(x || y)
        //Bitwise operators:
        x = ~y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        x = x << 1;
        x = x >> 1;
        x = x >>> 1;
        //Conpound assignment:
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;
        //Casting:
        //! boolean b1 = (booolean)x;
        char c = (char) x;
        byte i = (byte) x;
        short s = (short) x;
        int l = (int) x;
        float f = (float) x;
        double d = (double) x;

    }

    void floatTest(float x, float y) {
        // Aritmethic operators:
        x = x * y;
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        y--;
        x = + y;
        x = - y;
        //Relational and logical:
        f (x > y);
        f (x >= y);
        f (x < y);
        f (x <= y);
        f (x == y);
        f (x != y);
        //! f(!x)
        //! f(x && y)
        //! f(x || y)
        //Bitwise operators:
        //! x = ~y;
        //! x = x & y;
        //! x = x | y;
        //! x = x ^ y;
        //! x = x << 1;
        //! x = x >> 1;
        //! x = x >>> 1;
        //Conpound assignment:
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        //! x <<= 1;
        //! x >>= 1;
        //! x >>>= 1;
        //! x &= y;
        //! x |= y;
        //! x ^= y;
        //Casting:
        //! boolean b1 = (booolean)x;
        char c = (char) x;
        byte i = (byte) x;
        short s = (short) x;
        long l = (long) x;
        double d = (double) x;
    }

    void doubleTest(double x, double y) {
        // Aritmethic operators:
        x = x * y;
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        y--;
        x = + y;
        x = - y;
        //Relational and logical:
        f (x > y);
        f (x >= y);
        f (x < y);
        f (x <= y);
        f (x == y);
        f (x != y);
        //! f(!x)
        //! f(x && y)
        //! f(x || y)
        //Bitwise operators:
        //! x = ~y;
        //! x = x & y;
        //! x = x | y;
        //! x = x ^ y;
        //! x = x << 1;
        //! x = x >> 1;
        //! x = x >>> 1;
        //Conpound assignment:
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        //! x <<= 1;
        //! x >>= 1;
        //! x >>>= 1;
        //! x &= y;
        //! x |= y;
        //! x ^= y;
        //Casting:
        //! boolean b1 = (booolean)x;
        char c = (char) x;
        byte i = (byte) x;
        short s = (short) x;
        long l = (long) x;
    }

    @Test
    public void func1() {
        byte x = 1, y = 2;
        x = (byte)+ y;
        System.out.println(x);
    }
}
