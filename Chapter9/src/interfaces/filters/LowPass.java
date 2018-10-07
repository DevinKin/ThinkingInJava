package interfaces.filters;

/**
 * @author devinkin
 * <p>Title: LowPass</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 16:59 2018/9/21
 */
public class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
