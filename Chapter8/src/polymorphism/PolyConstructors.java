package polymorphism;

import static net.mindview.util.Print.print;

/**
 * @author devinkin
 * <p>Title: PolyConstructors</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 9:12 2018/9/21
 */

class Glyph {
    void draw() {
        print("Glyph.draw()");
    }
    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    @Override
    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
