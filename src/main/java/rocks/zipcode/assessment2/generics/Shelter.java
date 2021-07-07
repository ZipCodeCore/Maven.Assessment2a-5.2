package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.*;
import java.util.function.Consumer;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 *
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */

public class Shelter<_> implements Iterable<Ageable> {

    List<Object> shelter;

    public Shelter() {

        shelter = new ArrayList<Object>();
        //throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return shelter.size();
    }

    public void add(Object object) {
        shelter.add(object);
    }

    public Boolean contains(Object object) {
        for(Object o : shelter)
            if(o == object)
                return true;

        return false;
    }

    public void remove(Object object) {
        shelter.remove(object);
    }

    public Object get(Integer index) {
        return shelter.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return shelter.indexOf(ageable);
    }

    @Override
    public Iterator<Ageable> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Ageable> action) {

    }

    @Override
    public Spliterator<Ageable> spliterator() {
        return null;
    }
}