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
public class Shelter<TypeLivingBeing extends Ageable> implements Iterable {
    private volatile ArrayList<TypeLivingBeing> list = new ArrayList<>();
    Iterator iter = list.iterator();
    public Shelter() {
        //throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return list.size();
    }

    public void add(TypeLivingBeing typeLivingBeing) {
        list.add(typeLivingBeing);
    }


    public Boolean contains(Object object) {
        return list.contains(object);
    }

    public void remove(Object object) {
        list.remove(object);
    }

    public Object get(Integer index) {
        return list.get(index);
    }

    public Integer getIndexOf(TypeLivingBeing typeLivingBeing) {
        for (TypeLivingBeing tp: list)
        {
            if (tp == typeLivingBeing)
            {
                return list.indexOf(tp);
            }
        }
     /* while(iter.hasNext())
        {
            if (iter.next() == typeLivingBeing)
            {
                return list.indexOf(iter.next());
            }
        } */
        return -1;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}