package rocks.zipcode.assessment2.generics;


import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.Context;
import rocks.zipcode.assessment2.generics.ageable.Ageable;
import rocks.zipcode.assessment2.generics.ageable.Cat;
import rocks.zipcode.assessment2.generics.ageable.Dog;
import rocks.zipcode.assessment2.generics.ageable.Person;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T extends Ageable> implements Iterable {

    ArrayList<Ageable>shelter = new ArrayList<>();


    public Shelter()throws NullPointerException{


    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return shelter.size();

    }

    public void add(Object object) {
        shelter.add((Ageable) object);
    }

    public Boolean contains(Object object) {
        return shelter.contains(object);
    }

    public void remove(Object object) {
        shelter.remove(object);
    }

    public Object get(Integer index) {
        return shelter.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return shelter.indexOf(ageable);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    }
