package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Dog;
import rocks.zipcode.assessment2.generics.ageable.Person;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> implements Iterable<T>{

    private ArrayList<T> items;
    public Shelter() {
//        throw new NullPointerException();
        //what was this NullPointerException for???
        this.items = new ArrayList<T>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return items.size();
    }

    public void add(Object object) {
        //cast the object as T, then add to ArrayList
        items.add((T) object);
    }

    public Boolean contains(Object object) {
        //technically, this doesn't need the if and the separate return statements
        //but writing it this way helps me remember how it works
        //could also simply use:
        // return items.contains(object));
        if (items.contains(object)) {return true;}
        return false;
    }

    public void remove(Object object) {
        items.remove(object);
    }

    public Object get(Integer index) {
        return items.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).equals(ageable)){return i;}
        }
        return 0;
    }

    @Override
    //this doesn't seem to be used in any of the tests
    // there's only a test for whether Shelter implements Iterable or not
    public Iterator<T> iterator() {
        return null;
    }
}