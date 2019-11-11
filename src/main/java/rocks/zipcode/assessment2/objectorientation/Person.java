package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    public Long id;
    public String name;
    public Address residence;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.residence = address;
    }

    public Person() {
        this.id = 0L;
        this.name = "";
        this.residence = new Address();
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
        return this.residence;
    }

    public void setAddress(Address address) {
        this.residence = address;
    }

    @Override
    public boolean equals(Person o) {
        boolean ans = this.id == o.getId() &&
                this.name == o.getName() &&
                this.residence == o.getAddress();

        return ans;
    }
}