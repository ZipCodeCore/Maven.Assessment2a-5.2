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
public class Shelter<T extends Ageable> implements Iterable<Ageable>{
    ArrayList<Ageable> livingObject;
    public Shelter() {
        //throw new NullPointerException();
        livingObject = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return livingObject.size();
    }

    public void add(T object) {
        livingObject.add(object);
    }

    public Boolean contains(Object object) {
        return livingObject.contains(object);
    }

    public void remove(Object object) {
        livingObject.remove(object);
    }

    public Object get(Integer index) {
        return livingObject.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return livingObject.indexOf(ageable);
    }

    @Override
    public Iterator<Ageable> iterator(){
        return livingObject.iterator();
    }
}