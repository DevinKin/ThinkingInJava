package exercise;

class Field {
    static String str1 = "str1";
    static String str2;
    static {
        str2 = "str2";
    }

    void printstr() {
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}


public class e14 {
    public static void main(String[] args) {
        Field field = new Field();
        field.printstr();
    }
}
