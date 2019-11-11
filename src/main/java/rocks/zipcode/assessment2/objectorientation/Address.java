package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    public String addressLine1;
    public String addressLine2;
    public String city;
    public String state;
    public String zipcOde;


    public Address() {
        this.addressLine1 = "";
        this.addressLine2 = "";
        this.city = "";
        this.state = "";
        this.zipcOde = "";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */

    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcOde = zipcode;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return this.zipcOde;
    }

    public void setZipcode(String zipcode) {
        this.zipcOde = zipcode;
    }

    //@Override
    public boolean equals(Address o) {
        boolean ans = this.addressLine1 == o.getAddressLine1() &&
        this.addressLine2 == o.getAddressLine2() &&
        this.city == o.getCity() &&
        this.state == o.getState() &&
        this.zipcOde == o.getZipcode();

        return ans;
    }

    @Override
    public String toString(){
        return "Address{addressLine1='" + this.addressLine1  +
                "', addressLine2='" + this.addressLine2 +
                "', city='" + this.city +
                "', state='" + this.state +
                "', zipcode='" + this.zipcOde +
                "'}";

    }
}
