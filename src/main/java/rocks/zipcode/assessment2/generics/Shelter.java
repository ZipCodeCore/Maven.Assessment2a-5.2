package rocks.zipcode.assessment2.generics;

import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<Object> {
    Map<String, List<Object>> object = new HashMap<>();

    /**
     * @return the number of item in the shelter
     */
    public <Object> int size() {

        return object.size();
    }

    public void add(Object object) {
        ;
    }

    public Boolean contains(Object object) {
        return false;
//        return object.contains();
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