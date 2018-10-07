package interfaces.filters;

/**
 * @author devinkin
 * <p>Title: HighPass</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 17:01 2018/9/21
 */
public class HighPass extends Filter{
    double cuoff;
    public HighPass(double cuoff) {
        this.cuoff = cuoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
