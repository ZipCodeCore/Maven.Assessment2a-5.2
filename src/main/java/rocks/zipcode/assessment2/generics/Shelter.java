package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter< T extends Ageable> implements Iterable <T>{

    List<T> ageObj;
    public Shelter() {

        ageObj = new ArrayList<T>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return ageObj.size();
    }

    public void add(Object object) {
        ageObj.add((T)object);
    }

    public Boolean contains(Object object) {

        return ageObj.contains((T)object);
    }

    public void remove(Object object) {
        ageObj.remove((T)object);
    }

    public Object get(Integer index) {
        return ageObj.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}