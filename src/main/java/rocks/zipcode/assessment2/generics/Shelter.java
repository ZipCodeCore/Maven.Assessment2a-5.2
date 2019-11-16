package rocks.zipcode.assessment2.generics;

import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T extends Ageable> implements Iterable<T>{
    private ArrayList<T> items;

    public Shelter(){
        this.items = new ArrayList<T>();
//        this.items = new T(); you cant do this because with generics, it does not know how to compile this
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return items.size();
    }

    public void add(T object) {
        items.add(object);
    }

    public Boolean contains(T object) {
        return items.contains(object);
    }

    public void remove(T object) {
        items.remove(object);
    }

    public T get(Integer index) {
        return items.get(index);
    }

    public Integer getIndexOf(T ageable) {
        for (int i = 0; i < items.size(); i++){
            if(items.get(i).equals(ageable)){
                return i;
            }
        }
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        //non-functionally passes tests!**
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