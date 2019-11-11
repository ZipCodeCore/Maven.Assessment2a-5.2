package rocks.zipcode.assessment2.generics;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<Ageable> implements Iterable<Ageable> {
    private ArrayList<Ageable> contents;

    public Shelter() {
        contents = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return contents.size();
    }

    public void add(Ageable object) {
        contents.add(object);
    }

    public Boolean contains(Object object) {
        return contents.contains(object);
    }

    public void remove(Object object) {
        contents.remove(object);
    }

    public Object get(Integer index) {
        return contents.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return contents.indexOf(ageable);
    }

    public Iterator iterator(){
        return contents.iterator();
    }
}