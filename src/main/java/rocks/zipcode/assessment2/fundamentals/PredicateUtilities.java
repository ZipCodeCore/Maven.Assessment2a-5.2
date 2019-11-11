package rocks.zipcode.assessment2.fundamentals;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class PredicateUtilities {
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 2
     */
    public static Boolean isEven(Integer value) {
        Boolean even = false;
        if (value % 2 == 0) {
            even = true;
        }
        return even;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is not a multiple of 2
     */
    public static Boolean isOdd(Integer value) {
        Boolean odd = false;
        if (isEven(value) == false) {
            odd = true;
        }
        return odd;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 3
     */
    public static Boolean isMultipleOf3(Integer value) {
        Boolean multi3 = false;
        if (value % 3 == 0) {
            multi3 = true;
        }
        return multi3;
    }

    /**
     * @param value    - the value to be evaluated
     * @param multiple - the multiple to test `value` against
     * @return true if `value` is a multiple of `multiple`
     */
    public static Boolean isMultipleOfN(Integer value, Integer multiple) {
        Boolean multi = false;
        if (value % multiple == 0) {
            multi = true;
        }
        return multi;
    }


    /**
     * @param string - the string to be evaluated
     * @return true if `string` starts with a capital letter
     */
    public static Boolean startsWithCapitalLetter(String string) {
        Boolean cap = false;
        if (Character.isUpperCase(string.charAt(0))) {
            cap = true;
        }
        return cap;
    }
}
