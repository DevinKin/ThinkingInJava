package holding;

import typeinfo.pets.*;

import java.util.*;

import static net.mindview.util.Print.print;

public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        print("1: " + pets);
        Hamster h = new Hamster();
        // Automatically resizes
        pets.add(h);
        print("2: " + pets);
        print("3: " + pets.contains(h));
        // Remove by object
        pets.remove(h);
        Pet p = pets.get(2);
        print("4: " + p + " " + pets.indexOf(p));
        Pet cymric = new Cymric();
        print("5: " + pets.indexOf(cymric));
        print("6: " + pets.remove(cymric));
        // Must be the exact object:
        print("7: " + pets.remove(p));
        print("8: " + pets);
        // Insert at an index
        pets.add(3, new Mouse());
        print("9: " + pets);
        List<Pet> sub = pets.subList(1,4);
        print("subList: " + sub);
        print("10: " + pets.containsAll(sub));
        // In-place sort
        Collections.sort(sub);
        print("sorted subList: " + sub);
        // Order is not important in containsAll():
        print("11: " + pets.containsAll(sub));
        Collections.shuffle(sub, rand);
        print("shuffled subList: "  + sub);
        print("12: " + pets.containsAll(sub));
        List<Pet> copy = new ArrayList<>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        print("sub: " + sub);
        copy.retainAll(sub);
        print("13: " + copy);
        // Get a fresh copy
        copy = new ArrayList<>(pets);
        // Remove by index
        copy.remove(2);
        print("14: " + copy);
        // Only removes exact objects
        copy.removeAll(sub);
        print("15: " + copy);
        // Replace an element
        copy.set(1, new Mouse());
        print("16: " + copy);
        // Insert a list in the middle
        copy.addAll(2, sub);
        print("17: " + copy);
        print("18: " + pets.isEmpty());
        // Remove all elements
        pets.clear();
        print("19: " + pets);
        print("20: " + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        print("21: " + pets);
        Object[] o = pets.toArray();
        print("22: " + o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        print("23: " + pa[3].id());
    }
}
