package rocks.zipcode.assessment2.collections;

import java.util.HashMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */

    HashMap<Integer, String> calMap;

    public void add(Integer monthNumber, String monthName) {
        calMap.put(monthNumber, monthName);
    }

    // nullary constructor initializes a new list like Inventory class
    public MonthConversion() {
        calMap = new HashMap<>();
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return calMap.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */

    //changed int to Integer to return null and pass test
    public Integer getNumber(String monthName) {
        for (Integer key : calMap.keySet()) {
            if (calMap.get(key).equals(monthName)){
            return key;
            }
        }
        return null;
    }




    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return (this.calMap.containsKey(monthNumber));
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return (this.calMap.containsValue(monthName));
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return calMap.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        this.calMap.put(monthNumber, monthName);
    }


}
