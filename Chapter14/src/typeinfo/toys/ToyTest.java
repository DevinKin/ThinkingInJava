package typeinfo.toys;

import static net.mindview.util.Print.print;

interface HashBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    // Comment out the following default constructor
    // to see NoSuchMethodError from (*1*)
    Toy() {
    }

    Toy(int i) {
    }
}

class FancyToy extends Toy implements HashBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        print("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("typeinfo.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            print("Cannot find FancyToy");
            System.exit(1);
        }
        printInfo(c);

        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // Require default constructor
            obj = up.newInstance();
        } catch (IllegalAccessException e) {
            print("Cannot access");
            System.exit(1);
        } catch (InstantiationException e) {
            print("Cannot instantiate");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
