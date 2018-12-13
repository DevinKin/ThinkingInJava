package exercises;

import generics.Holder3;
import generics.pets.Cat;
import generics.pets.Pet;

public class e1 {

    public static void main(String[] args) {
        Holder3<Pet> ph = new Holder3<>(new Cat());
        System.out.println(ph);
    }
}
