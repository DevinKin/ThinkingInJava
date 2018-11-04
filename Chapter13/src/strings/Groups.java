package strings;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import net.mindview.atunit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class Groups {
    static public final String POEM =
            "Twas briling, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves.\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son.\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);

        while (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++) {
                printnb("[" + m.group(i) + "]");
            }
            print();
        }
        System.out.println("===============================");
        exercise12();
    }

    public static void exercise12() {
        Set<String> strings = new HashSet<>();
        Matcher m = Pattern.compile("\\w+").matcher(POEM);
        while (m.find()) {
            if (!m.group().matches("[A-Z].*")) {
                strings.add(m.group());
                System.out.println(m.group());
            }
        }
        System.out.println(strings.size());
    }
}
