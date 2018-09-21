package polymorphism.shape;

/**
 * @author devinkin
 * <p>Title: Shapes</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 23:40 2018/9/20
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape s[] = new Shape[9];
        // Fill up the aray with shapes
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        // Make polymorphic method calls:
        for (Shape shp : s) {
            shp.draw();
        }
    }
}
