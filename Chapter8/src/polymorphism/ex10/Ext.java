package polymorphism.ex10;

/**
 * @author devinkin
 * <p>Title: Ext</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 23:59 2018/9/20
 */
public class Ext extends Base{
    @Override
    public void method2() {
        System.out.println("Ext method2");
    }

    public static void main(String[] args) {
        Base b = new Ext();
        b.method1();
    }
}
