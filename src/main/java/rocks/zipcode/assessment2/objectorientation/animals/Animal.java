package rocks.zipcode.assessment2.objectorientation.animals;

import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal {
    public Animal() {
    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    Long animalid = 0L;
    Person owner = new Person();
    public Animal(Long id, Person owner) {
    }

    public Long getId() {
        return animalid;
    }

    public void setId(Long id) {
        this.animalid = animalid;
    }

    public Person getOwner() {
        return null;
    }

    public void setOwner(Person owner) {
    }

    public Address getAddress() {
        return null;
    }
}
