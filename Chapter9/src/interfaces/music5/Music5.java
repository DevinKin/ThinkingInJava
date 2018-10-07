package interfaces.music5;

/**
 * @author devinkin
 * <p>Title: Music5</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 16:29 2018/9/21
 */

import interfaces.music4.Note;

import static net.mindview.util.Print.*;

interface Instrument {
    // Compile-time constant:
    //static
    int VALUE = 5;
    // Cannot have method definitions:
    // Automatically public
    void play(Note n);
    void adjust();
}

class Wind implements Instrument {

    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }
}

class Percussion implements Instrument {

    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }
}

class Stringed implements Instrument {

    @Override
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        print(this + ".adjust()");
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwing extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        // Upcasing during addition to the array
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwing()
        };
        tuneAll(orchestra);
    }
}
