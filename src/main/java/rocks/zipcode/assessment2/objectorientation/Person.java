package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
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
        address.append(String.format("Person{id=%s, name='%s', address=%s}",this.personId,this.personName,this.personAddress));
        return address.toString();

    }

    @Override
    public boolean equals(Object o) {
        return (this.toString().equals(((Person)o).toString()));
    }

}