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
public class Shelter<P extends Ageable> implements Iterable<P> {

    ArrayList<P> list;

    public Shelter() {
        this.list = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return list.size();
    }

    public void add(P object) {
        list.add(object);
    }

    public Boolean contains(P object) {
        return list.contains(object);
    }

    public void remove(P object) {
        list.remove(object);
    }

    public Object get(Integer index) {
        return list.get(index);
    }

    public Integer getIndexOf(P ageable) {
        return list.indexOf(ageable);
    }

    @Override
    public Iterator<P> iterator() {
        return null;
    }
}