package polymorphism;

/**
 * @author devinkin
 * <p>Title: Sandwich</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 8:08 2018/9/21
 */

import static net.mindview.util.Print.*;

class Meal {
    Meal() {
        print("Meal()");
    }
}
class Bread {
    Bread() {
        print("Bread()");
    }
}
class Cheese {
    Cheese() {
        print("Cheese()");
    }
}
class Lettuce {
    Lettuce() {
        print("Lettuce()");
    }
}
class Lunch extends Meal{
    Lunch() {
        print("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        print("PortableLunch()");
    }
}



public class Sandwich extends PortableLunch{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwich() {
        print("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
