package interfaces.interfaceprocessor;

import static net.mindview.util.Print.print;

/**
 * @author devinkin
 * <p>Title: Apply</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 17:10 2018/9/21
 */
public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
}
