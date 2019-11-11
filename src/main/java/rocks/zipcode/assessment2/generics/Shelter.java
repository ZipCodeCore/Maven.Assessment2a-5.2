package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.Iterator;
import java.util.Spliterator;
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

    public Shelter() {


        //throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return -1;
    }

    public void add(Object object) {
    }

    public Boolean contains(Object object) {
        return null;
    }

    public void remove(Object object) {
    }

    public Object get(Integer index) {
        return null;
    }

    public Integer getIndexOf(Object ageable) {
        return 0;
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