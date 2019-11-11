package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public String addressLine1;
    public String addressLine2;
    public String city;
    public String state;
    public String zipcode;

    //Nullary constructor
    public Address(){

        this.addressLine1 = "";
        this.addressLine2 = "" ;
        this.city = "";
        this.state = "";
        this.zipcode = "";
    }

    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {

        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }


    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString(){

        String adress = String.format("Address{addressLine1='%s', addressLine2='%s', city='%s', " +
                        "state='%s', zipcode='%s'}", addressLine1, addressLine2, city, state, zipcode);
        return adress;
    }

    public boolean equals(Address o) {

        if(o.addressLine1 == this.addressLine1 && o.addressLine2 == this.addressLine2 &&
                 o.city == this.city && o.state == this.state && o.zipcode == this.zipcode)
            return true;

        return false;
    }
}
