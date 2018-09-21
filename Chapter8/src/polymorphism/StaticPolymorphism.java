package polymorphism;

/**
 * @author devinkin
 * <p>Title: StaticPolymorphism</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 8:02 2018/9/21
 */

class StaticSuper {
    public static String staticGet() {
        return "Base staticGet()";
    }

    public String dynamicGet() {
        return "Base dynamicGet()";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Derived staticGet()";
    }

    @Override
    public String dynamicGet() {
        return "Derived dynamicGet()";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        // Upcase
        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
