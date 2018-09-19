package exercise;

import static net.mindview.util.Print.print;

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute() ");
    }

    public void apply() {
        append(" apply() ");
    }

    public void scrub() {
        append(" scrub() ");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        print(x);
    }
}

class Detergent extends Cleanser {
    // Change a method;
    @Override
    public void scrub() {
        append(" Detergent.scrub() ");
        super.scrub();
    }

    // Add methods to the interface:
    public void foam() {
        append(" foam() ");
    }

    public void sterilize() {
        append(" sterilize() ");
    }
}

public class e2 {
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        print(x);
        print("Testing base class:");
        Cleanser.main(args);
    }
}
