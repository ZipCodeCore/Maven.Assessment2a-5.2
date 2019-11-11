package rocks.zipcode.assessment2.objectorientation;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    private String line1 = "";
    private String line2 = "";
    private String city = "";
    private String state = "";
    private String zipcide = "";

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
        this.line1 = addressLine1;
        this.line2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcide = zipcode;
    }

    public String getAddressLine1() {
        return this.line1;
    }

    public void setAddressLine1(String addressLine1) {
        this.line1 = addressLine1;
    }

    public String getAddressLine2() {
        return this.line2;
    }

    public void setAddressLine2(String addressLine2) {
        this.line2 = addressLine2;
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
        return this.zipcide;
    }

    public void setZipcode(String zipcode) {
        this.zipcide = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        return this.toString().equals(o.toString());
    }

    @Override
    public String toString() {
        return "Address{addressLine1='" + line1 +
                "', addressLine2='" + line2 +
                "', city='" + city +
                "', state='" + state +
                "', zipcode='" + zipcide + "'}";
    }
}
