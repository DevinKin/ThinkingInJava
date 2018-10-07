package interfaces.filters;

/**
 * @author devinkin
 * <p>Title: Filter</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 16:58 2018/9/21
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
