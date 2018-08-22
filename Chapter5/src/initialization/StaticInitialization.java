package initialization;


import javafx.scene.control.Tab;

import static net.mindview.util.Print.print;

class Bowl {
    Bowl(int marker) {
        print("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        print("f1(" + marker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);
    Table() {
        print("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        print("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}


class Cupoboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupoboard(){
        print("Cuppboard()");
        bowl4.f1(2);
    }
    void f3(int marker) {
        print("f3("+ marker + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}


public class StaticInitialization {
    public static void main(String[] args) {
        print("Creating new Cupboard() in main");
        new Cupoboard();
        print("Creating new Cupboard() in main");
        new Cupoboard();
        table.f2(1);
        cupoboard.f3(1);
    }
    static Table table = new Table();
    static Cupoboard cupoboard = new Cupoboard();
}
