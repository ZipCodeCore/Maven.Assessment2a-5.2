package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter {
    List<Object> shelt = new ArrayList<>();
    public Shelter() {

    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return shelt.size();
    }

    public void add(Object object) {
        shelt.add(object);
    }

    public Boolean contains(Object object) {
        return shelt.contains(object);
    }

    public void remove(Object object) {
        shelt.remove(object);
    }

    public Object get(Integer index) {
        return shelt.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return shelt.indexOf(ageable);
    }
}