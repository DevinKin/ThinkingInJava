package exercise.e3;

/**
 * @author devinkin
 * <p>Title: Sub</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 16:14 2018/9/21
 */

abstract class Base {
    abstract void print();
    Base() {
        print();
    }
}

public class Sub extends Base{
    private int i = 1;

    @Override
    void print() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.print();
    }
}
