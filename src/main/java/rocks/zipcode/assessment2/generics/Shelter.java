package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> {

    List newPerson;

    public Shelter() {
        //throw new NullPointerException();
        newPerson = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return newPerson.size();
    }

    public void add(Object object) {
        newPerson.add(object);
    }

    public Boolean contains(Object object) {
        return newPerson.contains(object);
    }

    public void remove(Object object) {
        newPerson.remove(object);
    }

    public Object get(Integer index) {
        return newPerson.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return 0;
    }
}