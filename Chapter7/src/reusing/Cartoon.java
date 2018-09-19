package reusing;

import static net.mindview.util.Print.print;

class Art {
    Art() { print("Art contructor();"); }
}

class Drawing extends Art {
    Drawing() {
        print("Drawing contructor();");
    }
}

public class Cartoon extends Drawing{
    public Cartoon() {
        print("Cartoon contructor();");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }

}
