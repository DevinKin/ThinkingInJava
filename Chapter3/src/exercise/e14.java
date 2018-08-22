package exercise;

public class e14 {
    public static void main(String[] args) {
        String s1 = "test1";
        String s2 = "test2";
        String s3 = "test1";
        String s4 = s1;
        stringCompare(s1, s2);
        System.out.println();
        stringCompare(s1,s3);
        System.out.println();
        stringCompare(s1,s4);
    }

    public static void stringCompare(String s1,String s2) {
        System.out.println("s1 == s2: " + s1 == s2);
        System.out.println("s1 != s2: " + s1 != s2);
        System.out.println("s1.equals(s2): " + s1.equals(s2));
    }
}
