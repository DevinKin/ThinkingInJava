package exercise.e11;

import interfaces.interfaceprocessor.Apply;
import interfaces.interfaceprocessor.StringProcessor;

import java.util.Arrays;

public class ExchangeCouple extends StringProcessor {
    @Override
    public String process(Object input) {
        String str = (String) input;
        String[] strs = str.split(" ");
        int len = strs.length;
        if (len > 1) {
            for (int i = 0; i < len - 1; i++) {
                String temp = strs[i + 1];
                strs[i] = strs[i + 1];
                strs[i] = temp;
            }
        }
        return Arrays.toString(strs);
    }

    public static String s =
            "If she weighs the same as a duck, she's made of wood";

    public static void main(String[] args) {
        Apply.process(new ExchangeCouple(), s);
    }
}
