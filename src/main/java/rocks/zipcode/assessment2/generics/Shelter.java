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
public class Shelter<Object> extends Ageable implements Iterable<Object>{

    ArrayList<Object> shelterList;
    public Shelter() {

        shelterList = new ArrayList<>();
        //throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {

        return shelterList.size();
    }

    public void add(Object object) {
        shelterList.add(object);
    }

    public Boolean contains(Object object) {

        return shelterList.contains(object);
    }

    public void remove(Object object) {
        shelterList.remove(object);
    }

    public Object get(Integer index) {

        return shelterList.get(index);
    }

    public Integer getIndexOf(Object ageable) {

        return shelterList.indexOf(ageable);
    }

    @Override
    public Iterator<Object> iterator() {
        return null;
    }
}