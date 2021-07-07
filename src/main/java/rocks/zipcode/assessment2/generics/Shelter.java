package rocks.zipcode.assessment2.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rocks.zipcode.assessment2.generics.ageable.Ageable;
import rocks.zipcode.assessment2.generics.ageable.Ageable;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> implements Iterable<T>  {
    private ArrayList<T> al;

    public Shelter() {
       // throw new NullPointerException();
        this.al = new ArrayList<T>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {

        return al.size();
    }

    public void add(Object object) {
        al.add((T)object);
    }

    public Boolean contains(Object object) {
      return al.contains(object);

    }

    public void remove(Object object) {
        al.remove(object);
    }

    public Object get(Integer index) {
        return al.get(index);
     }

    public Integer getIndexOf(Object ageable) {

        return al.indexOf(ageable);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }
}