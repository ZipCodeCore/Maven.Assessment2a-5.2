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
    private  Long id ;
    private  String name ;
    private  Address address;


    public Person(Long id, String name, Address address) {
        this.id=id;
        this.name=name;
        if(address==null){
            this.address=new Address();
        }
        else {
            this.address = address;
        }
    }

    public Person() {
        this.name="";
        this.id = Long.MIN_VALUE;
        this.address=new Address();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id=id;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        Address address1=new Address();
        this.address=address;
    }

    @Override
    public boolean equals(Object o) {
        return this.toString().equals(o.toString());
    }

    @Override
    public String toString() {
      return String.format("Person{id=%d, name='%s', address=%s}",getId(),getName(),getAddress());
    }
}