package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    Long id;
    String name;
    Address personsAddress;


    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.personsAddress = address;
    }

    public Person() {
        id = Long.MIN_VALUE;
        name = "";
        personsAddress = new Address();
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
        return this.personsAddress;
    }

    public void setAddress(Address address) {
        this.personsAddress = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", personsAddress=" + personsAddress + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        return (Boolean)null;
//    }
}