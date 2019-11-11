package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T  > extends Ageable implements Iterable<T>  {
    ArrayList<T> newShelter = new ArrayList<T>();

    public Shelter() {

    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return newShelter.size();
    }

    public void add(Object object) {
        newShelter.add((T) object);
    }

    public Boolean contains(Object object) {
        return newShelter.contains(object);
    }

    public void remove(Object object) {
        newShelter.remove(object);
    }

    public Object get(Integer index) {
        return newShelter.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return newShelter.indexOf(ageable);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}