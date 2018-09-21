package polymorphism.music;

/**
 * @author devinkin
 * <p>Title: Music</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 23:18 2018/9/20
 */
public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        // Upcasting
        tune(flute);
    }
}
