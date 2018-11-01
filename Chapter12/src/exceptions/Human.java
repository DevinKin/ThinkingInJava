package exceptions;

class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

public class Human {
    public static void main(String[] args) {
        // Cache the exact type:
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }
        // Catche the base type:
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Caught Annoyance");
        }
    }
}
