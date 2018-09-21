package polymorphism.shape;

/**
 * @author devinkin
 * <p>Title: Circle</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 23:34 2018/9/20
 */
import static net.mindview.util.Print.*;

public class Circle extends Shape{
    @Override
    public void draw() {
        print("Circle.draw()");
    }

    @Override
    public void erase() {
        print("Circle.erase()");
    }
}
