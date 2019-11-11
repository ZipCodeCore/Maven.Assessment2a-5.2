package rocks.zipcode.assessment2.generics;


/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> {

    Shelter<T> shelter = new Shelter<>();

    public Shelter() {
        throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return shelter.size();
    }

    public void add(Object object) {
        shelter.add(object);
    }

    public Boolean contains(Object object) {
        if (shelter.contains(object)) {return true;}
        return false;
    }

    public void remove(Object object) {
        shelter.remove(object);
    }

    public Object get(Integer index) {
        return shelter.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return shelter.getIndexOf(ageable);
    }
}