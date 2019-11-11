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
    private long id;
    private String name;
    private Address address;
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;

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
        if (this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        Person tempPerson = (Person) o;
        if(!this.getAddress().equals(tempPerson.getAddress()))return false;
        if(!this.getName().equals(tempPerson.getName())) return false;
        return this.getId().equals(tempPerson.getId());
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Person{id=" + getId() + ",")
                .append(" name='" + name + "',")
                .append(" address=" + getAddress() + "}")
                .toString();
    }
}