package rocks.zipcode.assessment2.objectorientation;

import java.util.Objects;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    Long personId = 0L;
    String personName = "";
    Address personAddress = new Address();
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        personId = id;
        personName = name;
        personAddress = address;
    }

    public Person() {
    }

    public Long getId() {
        return personId;
    }

    public void setId(Long id) {
        personId = id;
    }

    public String getName() {
        return personName;
    }

    public void setName(String name) {
        personName = name;
    }

    public Address getAddress() {
        return personAddress;
    }

    public void setAddress(Address address) {
        personAddress = address;
    }

    @Override
    public boolean equals(Object o) {
        Person o1 = (Person) o;
        if (o1.personId == this.personId){
            return true;
        }else if(Objects.equals(o1.personName, this.personName)){
            return true;
        }else{
            return  false;
        }
    }
}