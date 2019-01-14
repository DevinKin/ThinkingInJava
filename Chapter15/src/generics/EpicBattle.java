package generics;

import java.util.List;

interface SuperPower {}
interface XRayVision extends SuperPower{
    void seeThroughWalls();
}
interface SuperHearing extends SuperPower {
    void hearSubtleNoises();
}
interface SuperSmell extends SuperPower {
    void trackBySmell();
}

class SuperHero<POWER extends SuperPower> {
    POWER power;
    SuperHero(POWER power) {
        this.power = power;
    }
    POWER getPower() {
        return power;
    }
}

class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER>{
    SuperSleuth(POWER power) {
        super(power);
    }
    void see() {
        power.seeThroughWalls();
    }
}

class CanineHero<POWER extends SuperHearing & SuperSmell> extends SuperHero<POWER>{
    CanineHero(POWER power) {
        super(power);
    }

    public void hearSubtleNoises() {}
    public void trackBySmell() {}
}

class SuperHearSmell implements SuperHearing, SuperSmell {

    @Override
    public void hearSubtleNoises() {

    }

    @Override
    public void trackBySmell() {

    }
}

class DogBody extends CanineHero<SuperHearSmell> {
    DogBody() {
        super(new SuperHearSmell());
    }
}


public class EpicBattle {
    // Bounds in generic methods:
    static <POWER extends SuperHearing & SuperSmell>
    void superFind(SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNoises();
        hero.getPower().trackBySmell();
    }
    static <POWER extends SuperHearing & SuperSmell>
    void useSuperHearing(SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNoises();;
    }
    public static void main(String[] args) {
        DogBody dogBody = new DogBody();
        useSuperHearing(dogBody);
        superFind(dogBody);
        // you can do this:
        List<? extends SuperHearing> audioBoys;
        // But you can't do this:
//        List<? extends SuperHearing & SuperSmell> dogBoys;
    }
}
