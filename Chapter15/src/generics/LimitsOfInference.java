package generics;

import generics.pets.Person;
import generics.pets.Pet;
import net.mindview.util.New;

import java.util.List;
import java.util.Map;

public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {}

    public static void main(String[] args) {
        f(New.map());
        f(New.<Person, List<? extends Pet>>map());
    }
}
