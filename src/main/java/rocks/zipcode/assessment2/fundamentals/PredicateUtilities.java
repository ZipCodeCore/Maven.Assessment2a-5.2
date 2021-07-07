package rocks.zipcode.assessment2.fundamentals;

public class PredicateUtilities {
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 2
     */
    public static Boolean isEven(Integer value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is not a multiple of 2
     */
    public static Boolean isOdd(Integer value) {

        if (value % 2 == 1) {
            return true;
        }
        return false;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 3
     */
    public static Boolean isMultipleOf3(Integer value) {
        if (value % 3 == 0) {
            return true;
        }
        return false;
    }

    /**
     * @param value    - the value to be evaluated
     * @param multiple - the multiple to test `value` against
     * @return true if `value` is a multiple of `multiple`
     */
    public static Boolean isMultipleOfN(Integer value, Integer multiple) {

        if (value % multiple == 0) {
            return true;
        }
        return false;
    }

    /**
     * @param string - the string to be evaluated
     * @return true if `string` starts with a capital letter
     */
    public static Boolean startsWithCapitalLetter(String string) {
        String holder = "";
        String upperHolder = "";
        holder += string.charAt(0);
        if ((string.charAt(0) >= 'a' && string.charAt(0) <= 'z') || (string.charAt(0) >= 'A' && string.charAt(0) <= 'Z')) {
            String comparative = String.valueOf(string.charAt(0));
            upperHolder = holder.toUpperCase();
            System.out.println(holder);
            System.out.println(string.charAt(0));
            if (upperHolder.equals(comparative)) {
                return true;
            } else return false;
        }
        return false;
    }
}