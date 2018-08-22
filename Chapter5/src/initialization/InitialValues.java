package initialization;

import static net.mindview.util.Print.print;

public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    InitialValues references;

    void printInitialValues() {
        print("Data type        Initail value");
        print("boolean      " + t);
        print("char         [" + c + "]");
        print("byte         " + b);
        print("short        " + s);
        print("int          " + i);
        print("long         " + l);
        print("float        " + f);
        print("double       " + d);
        print("reference    " + references);
    }

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();
        new InitialValues().printInitialValues();
    }
}
