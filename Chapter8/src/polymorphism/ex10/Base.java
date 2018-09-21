package polymorphism.ex10;

/**
 * @author devinkin
 * <p>Title: Base</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 23:58 2018/9/20
 */
public class Base {
    public void method1() {
        System.out.println("Base method1");
        method2();
    }

    public void method2() {
        System.out.println("Base method2");
    }
}
