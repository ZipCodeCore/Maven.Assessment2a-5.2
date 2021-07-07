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
public class Shelter<T> implements Iterable<T>{

    private ArrayList<T> ageables;

    public Shelter() {
        this.ageables = new ArrayList<T> ();


        //throw new NullPointerException();
    }

    //if Shelter is empty or if object doesn't extend ageable throw null pointer exception.

    /**
     * @return the number of item in the shelter
     */
    public int size() {

        return ageables.size();
    }

    public void add(T object) {
        ageables.add(object);
    }

    public Boolean contains(T object) {

        return ageables.contains(object);
    }

    public void remove(T object) {
        ageables.remove(object);
    }

    public T get(Integer index) {

        return ageables.get(index);
    }

    public Integer getIndexOf(T ageable) {
        for (int i = 0; i < ageables.size(); i++) {
             if(ageables.get(i).equals(ageable)){
                 return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
