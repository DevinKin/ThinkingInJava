package polymorphism;

/**
 * @author devinkin
 * <p>Title: Transmogrify</p>
 * <p>Description: </p>
 * @version 1.0
 * @see
 * @since 9:27 2018/9/21
 */

import static net.mindview.util.Print.*;

class Actor {
    public void act() {}
}

class HappyActior extends Actor {
    @Override
    public void act() {
        print("HappyActor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        print("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActior();
    public void change() {
        actor = new SadActor();
    }
    public void performPlay() {
        actor.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
