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
        String addressLine1 = this.personAddress.getAddressLine1();
        String addressLine2 = this.personAddress.getAddressLine2();
        String city = this.personAddress.getCity();
        String state = this.personAddress.getState();
        String zipcode = this.personAddress.getZipcode();

        StringBuilder address = new StringBuilder();
        address.append(String.format("Address{addressLine1='%s', addressLine2='%s', city='%s', state='%s', zipcode='%s'",addressLine1,addressLine2,city,state,zipcode));
        return address.toString();
    }


    @Override
    public boolean equals(Object o) {
        return (Boolean)null;
    }
}