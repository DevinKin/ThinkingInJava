package polymorphism.shape;

/**
 * @author devinkin
 * <p>Title: Triangle</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 23:37 2018/9/20
 */

import static net.mindview.util.Print.*;

public class Triangle extends Shape{
    @Override
    public void draw() {
        print("Triangle.draw()");
    }

    @Override
    public void erase() {
        print("Triangle.erase()");
    }
}
