package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Dog;
import rocks.zipcode.assessment2.objectorientation.Person;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> implements Iterable{

    private ArrayList<Object> shelter;

    public Shelter() {
    this.shelter = new ArrayList<>();
//        throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return shelter.size();
//        return -1;
    }

    public void add(Object object) {
        shelter.add(object);
    }

    public Boolean contains(Object object) {
        return shelter.contains(object);
//        return null;
    }

    public void remove(Object object) {
        shelter.remove(object);
    }

    public Object get(Integer index) {
        return shelter.get(index);
//        return null;
    }

    public Integer getIndexOf(Object ageable) {
        for (int i = 0; i <shelter.size() ; i++) {
            if(shelter.get(i).equals(ageable)){
                return i;
            }
        }
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}