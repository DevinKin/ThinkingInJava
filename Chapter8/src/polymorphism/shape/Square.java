package polymorphism.shape;

/**
 * @author devinkin
 * <p>Title: Square</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 23:35 2018/9/20
 */

import static net.mindview.util.Print.*;

public class Square extends Shape{
    @Override
    public void draw() {
        print("Square.draw()");
    }

    @Override
    public void erase() {
        print("Square.erase()");
    }
}
