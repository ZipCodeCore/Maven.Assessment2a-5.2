package rocks.zipcode.assessment2.objectorientation;

import rocks.zipcode.assessment2.objectorientation.animals.Animal;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */

    Address newAddress;
    Long id;
    String name;
    Animal newPet;

    public Person(Long id, String name, Address address) {
        this.newAddress = address;
        this.id = id;
        this.name = name;
    }

    public Person() {
        newPet = new Animal();
        newPet.setOwner(this);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return this.newAddress;
    }

    public void setAddress(Address address) {
        this.newAddress = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person){
            Person x = (Person) o;
            return (getAddress() == x.getAddress() && getId() == x.getId() && getName() == x.getName() );
        }
        return false;
    }
}