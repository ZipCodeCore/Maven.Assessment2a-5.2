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
public class Shelter<T> extends Ageable implements Iterable <T> {
    private ArrayList<T> items;
    public Shelter() {
        //throw new NullPointerException();
        this.items = new ArrayList<T>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return items.size();
    }

    public void add(Object object) {
        items.add((T)object);
    }

    public Boolean contains(Object object) {
        return items.contains(object);
    }

    public void remove(Object object) {
        items.remove(object);
    }

    public Object get(Integer index) {
        return items.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        for(int i = 0; i < items.size(); i++){
            if(items.get(i)==ageable){
                return i;
            }
        }
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}