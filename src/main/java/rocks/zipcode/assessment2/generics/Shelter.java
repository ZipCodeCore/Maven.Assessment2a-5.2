package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> {

    private T element;
    public T get() {return element;}
    public void put(T item) {this.element = item;}
    private Shelter<Ageable> gimmieShelter;

    public Shelter() {

        throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return this.gimmieShelter.size();
    }

    public void add(Object object) {
        this.gimmieShelter.add(object);
    }

    public Boolean contains(Object object) {
        return this.gimmieShelter.contains(object);
    }

    public void remove(Object object) {
        this.gimmieShelter.remove(object);
    }

    public Object get(Integer index) {
        return this.gimmieShelter.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return this.gimmieShelter.getIndexOf(ageable);
    }
}