package exercise;

class Field15 {
    String str2;

    {
        str2 = "str2";
    }

    void printstr() {
        System.out.println("str2: " + str2);
    }
}


public class e15 {
    public static void main(String[] args) {
        Field15 field = new Field15();
        field.printstr();
    }
}
