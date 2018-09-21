package polymorphism.music;

/**
 * @author devinkin
 * <p>Title: Wind</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 22:55 2018/9/20
 */

import static net.mindview.util.Print.*;

class Instrument {
    public void play(Note n) {
        print("Instrument.play()");
    }
}

// Wind objects
public class Wind extends Instrument{
    // Redefine interface method:
    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
