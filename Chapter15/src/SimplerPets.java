import generics.pets.Person;
import generics.pets.Pet;
import net.mindview.util.New;

import java.util.List;
import java.util.Map;

public class SimplerPets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
    }
}
