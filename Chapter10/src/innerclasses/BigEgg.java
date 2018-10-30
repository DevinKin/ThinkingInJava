package innerclasses;

import static net.mindview.util.Print.print;

class Egg {
    private Yolk y;
    protected  class Yolk {
        public Yolk() {
            print("Egg Yolk()");
        }
    }

    public Egg() {
        print("New Egg()");
        y = new Yolk();
    }
}

public class BigEgg extends Egg{
    private Yolk y;
    public class Yolk {
        public Yolk() {
            print("BigEgg.Yolk");
        }
    }

    public BigEgg() {
        print("New BiggEgg()");
        y = new Yolk();
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
