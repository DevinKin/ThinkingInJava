package interfaces.filters;

/**
 * @author devinkin
 * <p>Title: BandPass</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 17:02 2018/9/21
 */
public class BandPass extends Filter{
    double lowCutoff, highCutoff;
    public BandPass(double lowCut, double highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
