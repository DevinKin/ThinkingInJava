package generics.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator{
    private static List<Class<? extends Pet>> types =
            new ArrayList<>();
    // Types that you want to be randomly createed:
    private static String[] typeNames = {
            "typeinfo.pets.Mutt",
            "typeinfo.pets.Pug",
            "typeinfo.pets.EgyptianMau",
            "typeinfo.pets.Manx",
            "typeinfo.pets.Cymric",
            "typeinfo.pets.Rat",
            "typeinfo.pets.Mouse",
            "typeinfo.pets.Hamster",
            "typeinfo.pets.Gerbil",
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames) {
                types.add((Class<? extends Pet>)
                        Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static {
        loader();
    }
    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
