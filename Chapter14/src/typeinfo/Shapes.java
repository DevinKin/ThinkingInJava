package typeinfo;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    public boolean highlighted = false;

    public boolean isHighlighted() {
        return highlighted;
    }

    public void setHighlighted(boolean highlighted) {
        this.highlighted = highlighted;
    }

    void draw() {
        System.out.println(this + ".draw() with " + (highlighted ? "highlighted" : "normal"));
    }
    abstract public String toString();
}

class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {

    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {

    @Override
    public String toString() {
        return "Triangle";
    }
}

class Rhomboid extends Shape {

    @Override
    public String toString() {
        return "Rhomboid";
    }
}

public class Shapes {
    public static void rotate(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println(shape + " is rotating");
        }
    }
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        for (Shape shape : shapeList) {
            if (shape instanceof Circle) {
                shape.setHighlighted(true);
            }
            shape.draw();
            rotate(shape);
        }
        Rhomboid rhomboid = (Rhomboid) shapeList.get(3);
        rhomboid.draw();

        Circle circle = null;
        if (shapeList instanceof Circle) {
             circle = (Circle) shapeList.get(3);
            circle.draw();
        } else {
            System.out.println(circle);
        }
        printSuperClass(Circle.class);
    }

    public static void printSuperClass(Class clazz) {
        while (clazz != null) {
            System.out.println(clazz.getSimpleName());
            System.out.println(Arrays.toString(clazz.getDeclaredFields()));
            clazz = clazz.getSuperclass();
        }
    }
}
