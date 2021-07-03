package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    Long id;
    String name;
    Address address;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;

    }

    // Nullary constructor
    public Person() {
        this.id = Long.MIN_VALUE;
        this.name = "";
        this.address = new Address();
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
        Person p = (Person) o;
        // id
        if(this.id != null && p.id != null){
            if (this.id.equals(p.id))
            {
                return true;
            }
        }else if (this.id == null && p.id==null) {
            return true;
        }

        // name
        if(this.name !=null && p.name !=null){
            if(this.name.equals(p.name)){
                return true;
            }
        } else if (this.name == null && p.name==null) {
            return true;
        }

        // address
        if(this.address != null && p.address!=null)
        {
            if(this.address.equals(p.address))
            {
                return true;
            }
        }
        else if (this.address == null && p.address==null) {
            return true;
        }

        // check null for all instance fields
        if(this.address != null && this.id != null && this.name != null){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("id=");
        sb.append(this.id);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', address=");
        sb.append(this.address);
        sb.append("}");
        return sb.toString();
    }
}