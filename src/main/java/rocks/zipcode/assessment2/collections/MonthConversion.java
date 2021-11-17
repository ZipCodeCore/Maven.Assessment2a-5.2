package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */

    Map<Integer, String> ordinalMonths = new LinkedHashMap<Integer, String>();

    public void add(Integer monthNumber, String monthName) {
        ordinalMonths.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        if (ordinalMonths.containsKey(monthNumber) == false){return null;}
        return ordinalMonths.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        if (ordinalMonths.containsValue(monthName) == false){return null;}
        for (int i = 1; i <=12; i++)
            if (ordinalMonths.containsKey(i)) {
                if (ordinalMonths.get(i).equals(monthName) == true) {
                    return i;
                }
            }
        return 0;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        if (ordinalMonths.containsKey(monthNumber) == true){return true;}
        return false;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        if (ordinalMonths.containsValue(monthName) == true){return true;}
        return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {

        return ordinalMonths.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        ordinalMonths.replace(monthNumber,monthName);
    }
}
