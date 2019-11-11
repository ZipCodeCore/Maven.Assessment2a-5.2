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

    private Long ID ;
    private String name;
    private Address address;
    public Person(Long id, String name, Address address) {

        this.ID = id;
        this.name = name;
        this.address = address;
    }

    public Person() {

        this.name="";
        this.address=new Address();

    }



    public Long getId() {
        return ID;
    }

    public void setId(Long id) {
        this.ID = id ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = new Address();
    }

    @Override
    public boolean equals(Object o) {
        return (Boolean)null;
    }
}