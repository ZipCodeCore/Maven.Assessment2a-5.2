package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person implements Comparable{
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     *
     */

    private Long personId;
    private String personName;
    private Address personAddress;
    public Person(Long id, String name, Address address) {
        this.personName = name;
        this.personId = id;
        this.personAddress = address;
    }

    public Person() {
        this.personName = "";
        this.personId = Long.MIN_VALUE;
        this.personAddress = new Address();
    }

    public Long getId() {
        return this.personId;
    }

    public void setId(Long id) {this.personId = id;
    }

    public String getName() {
        return this.personName;
    }

    public void setName(String name) {this.personName = name;
    }

    public Address getAddress() {
    return this.personAddress;
    }

    public void setAddress(Address address) {this.personAddress = address;

    }

    public String toString(){

        StringBuilder address = new StringBuilder();
        address.append(String.format("Person{id=%s, name='%s', address=%s}",getId(),getName(),getAddress().toString()));
       // address.append(String.format("Address{addressLine1='%s', addressLine2='%s', city='%s', state='%s', zipcode='%s'",addressLine1,addressLine2,city,state,zipcode));
        return address.toString();

    }

    @Override
    public boolean equals(Object o) {

        if (this.toString().equals(o.toString()))
            return true;
        else return false;
    }

    @Override
    public int compareTo(Object o) {
        return this.toString().compareTo(o.toString()) ; //todo may have to change
    }
}