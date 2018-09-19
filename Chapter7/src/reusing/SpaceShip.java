package reusing;

public class SpaceShip extends SpaceShipControls{
    private String name;
    public SpaceShip(String name) {this.name = name; }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NAEA Protector");
        protector.forward(100);
    }
}
