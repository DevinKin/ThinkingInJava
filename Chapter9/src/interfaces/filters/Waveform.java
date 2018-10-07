package interfaces.filters;

/**
 * @author devinkin
 * <p>Title: Waveform</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 16:57 2018/9/21
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform " + id;
    }
}
