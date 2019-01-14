package generics;

import java.util.HashMap;
import java.util.Map;

class Building {}
class House extends Building {}

public class ClassTypeCapture<T> {
    Class<T> kind;
    private Map<String, Class<?>> map = new HashMap<>();

    public void addType(String typename, Class<?> kind) {
        map.put(typename, kind);
    }

    public Object createNew(String typename) throws IllegalAccessException, InstantiationException {
        return map.get(typename).newInstance();
    }

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }
    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));
        ClassTypeCapture<House> ctt2 = new ClassTypeCapture<>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));
        ctt2.addType("String", String.class);
        ctt2.addType("Integer", Integer.class);
        String s = (String) ctt2.createNew("String");
//        Integer d = (Integer) ctt2.createNew("Integer");
//        System.out.println(d);
        System.out.println(s);
    }
}
