package rocks.zipcode.assessment2.objectorientation;

import java.util.Objects;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    String firstAddressLine = "";
    String secondAddressLine = "";
    String cityOfResidence = "";
    String stateOfResidence = "";
    String zipcodeOfResidence = "";

    public Address() {
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.firstAddressLine = addressLine1;
        this.secondAddressLine = addressLine2;
        this.cityOfResidence = city;
        this.stateOfResidence = state;
        this.zipcodeOfResidence = zipcode;
    }

    public String getAddressLine1() {
        return firstAddressLine;
    }

    public void setAddressLine1(String addressLine1) {
        this.firstAddressLine = addressLine1;
    }

    public String getAddressLine2() {
        return secondAddressLine;
    }

    public void setAddressLine2(String addressLine2) {
        this.secondAddressLine = addressLine2;
    }

    public String getCity() {
        return cityOfResidence;
    }

    public void setCity(String city) {
        this.cityOfResidence = city;
    }

    public String getState() {
        return stateOfResidence;
    }

    public void setState(String state) {
        this.stateOfResidence= state;
    }

    public String getZipcode() {
        return zipcodeOfResidence;
    }

    public void setZipcode(String zipcode) {
        this.zipcodeOfResidence = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        Address o1 = (Address) o;
        if (o1.firstAddressLine == this.firstAddressLine){
        return true;
    }else if(Objects.equals(o1.zipcodeOfResidence, this.zipcodeOfResidence)){
        return true;
    }else{
            return  false;
        }
}
}
