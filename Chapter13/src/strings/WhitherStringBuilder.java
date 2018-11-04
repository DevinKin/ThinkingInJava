package strings;

public class WhitherStringBuilder {
    public static String implicit(String[] fields) {
        String result = "";
        for (int i = 0; i < fields.length; i++) {
            result += fields[i];
        }
        return result;
    }

    public static String eplicit(String[] fields) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            result.append(fields[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] fields = {"abc", "mango", "def"};
        implicit(fields);
        System.out.println("==================");
        eplicit(fields);
    }
}
