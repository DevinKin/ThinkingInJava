package interfaces.interfaceprocessor;



/**
 * @author devinkin
 * <p>Title: StringProcessor</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 17:12 2018/9/21
 */

public abstract class StringProcessor implements Processor{
    @Override
    public String name() {
        return getClass().getSimpleName();
    }
    @Override
    public abstract String process(Object input);

    public static String s =
            "If she weighs the  same as a duck, she's made of wood";

    public static void main(String[] args) {
    }
}
