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
     */

    private Long id;
    private String name;
    private Address address;

    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        if (address != null) {
            this.address = address;
        }
        else { this.address = new Address(); }

    }

    public Person() {
        id = Long.MIN_VALUE;
        name = "";
        address = new Address();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
//        if (java.util.Objects.equals(this.id, o.id) && java.util.Objects.equals(this.name, o.name) && java.util.Objects.equals(this.address, o.address)){return true;}
//        else if (java.util.Objects.equals(this.id, o.id) && java.util.Objects.equals(this.name, o.name) && this.address.equals(o.address)){return true;}
        if (this.toString().equals(o.toString())){ return true;}
        return false;
    }

    public String toString(){
        String person;
        person = "Person{id="
                + id
                + ", name='"
                + name
                + "', address="
                + address.toString()
                + "}";
        return person;
    }

}