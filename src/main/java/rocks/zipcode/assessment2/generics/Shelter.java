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
public class Shelter<T extends Ageable> implements Iterable<T>{
    private ArrayList<T> obj;

    public Shelter() {
        this.obj = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return obj.size();
    }

    public void add(T object) {
        obj.add(object);
    }

    public Boolean contains(T object) {
        return obj.contains(object);
    }

    public void remove(T object) {
        obj.remove(object);
    }

    public T get(Integer index) {
        return obj.get(index);
    }

    public Integer getIndexOf(T object) {
        return obj.indexOf(object);
    }

    public Iterator<T> iterator() {
        return null;
    }
}