package interfaces.classprocessor;

import java.util.Arrays;

import static net.mindview.util.Print.print;

/**
 * @author devinkin
 * <p>Title: Apply</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 16:44 2018/9/21
 */

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    @Override
    String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processor {
    @Override
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Spliter extends Processor {
    @Override
    String process(Object input) {
        // The split() argument divides a String into pices;
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }

    public static String s =
            "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Spliter(), s);
    }
}
