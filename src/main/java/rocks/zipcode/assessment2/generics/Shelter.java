package rocks.zipcode.assessment2.generics;

import java.util.ArrayList;


/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<Object_> {
    private ArrayList<Object_> home;
    public Shelter() {

        home = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {

        return home.size();
    }

    public void add(Object object) {
        home.add((Object_) object);
    }

    public Boolean contains(Object object) {
        return home.lastIndexOf(object) >= 0;
    }

    public void remove(Object object) {
        home.remove(object);
    }

    public Object get(Integer index) {
        return home.get(index);
    }

    public Integer getIndexOf(Object ageable) {

        return home.indexOf(ageable);
    }
}