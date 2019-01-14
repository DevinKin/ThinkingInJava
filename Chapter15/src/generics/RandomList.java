package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);
    public void add(T item) {
        storage.add(item);
    }
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        RandomList<Integer> rs2 = new RandomList<>();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        rs2.add(integerList.get(0));
        rs2.add(integerList.get(1));
        rs2.add(integerList.get(2));
        rs2.add(integerList.get(3));
        rs2.add(integerList.get(4));
        for (String s : ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" ")) {
            rs.add(s);
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(rs.select() + " ");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(rs2.select() + " ");
        }
    }
}
