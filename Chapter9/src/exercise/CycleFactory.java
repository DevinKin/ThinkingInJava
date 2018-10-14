package exercise;

import static net.mindview.util.Print.print;

interface Cycle {
    void run();
}

interface myCycleFactory {
    Cycle getCycle();
}


class Unicycle implements Cycle {

    @Override
    public void run() {
        print("Unicycle running...");
    }
}

class UnicycleFactory implements myCycleFactory {

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {

    @Override
    public void run() {
        print("Bicycle running...");
    }
}

class BicycleFactory implements myCycleFactory {

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {

    @Override
    public void run() {
        print("Tricycle running...");
    }
}

class TricycleFactory implements myCycleFactory {

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class CycleFactory {
    public static void runCycle(myCycleFactory cycleFactory) {
        cycleFactory.getCycle().run();
    }

    public static void main(String[] args) {
        runCycle(new UnicycleFactory());
        runCycle(new BicycleFactory());
        runCycle(new TricycleFactory());

    }
}
