package polymorphism.shape;

import java.util.Random;

/**
 * @author devinkin
 * <p>Title: RandomShapeGenerator</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 23:38 2018/9/20
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
