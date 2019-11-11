package rocks.zipcode.assessment2.generics;

import java.util.ArrayList;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> {
    static ArrayList<String> list = new ArrayList<>();

    /**
     * @return the number of item in the shelter
     */
    public static int size() {
        return 10;
    }

    public void add(Object object) {

    }

    public Boolean contains(Object object) {
        if (list.contains(object)) {
            return true;
        }
        return false;
    }

    public void remove(Object object) {
        remove(object);
    }

    public Object get(Integer index) {
        return get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return 0;
    }
}