package exercise;

public class e21 {
    public static void main(String[] args) {
        for (Money money : Money.values()) {
            System.out.println(money + " ordinal: " + money.ordinal());
        }
    }
}
