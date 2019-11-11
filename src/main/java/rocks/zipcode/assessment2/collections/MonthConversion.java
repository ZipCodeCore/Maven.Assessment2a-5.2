package rocks.zipcode.assessment2.collections;


import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */

    TreeMap<Integer, String> calendar;

    public MonthConversion(){
        this.calendar = new TreeMap<>();
    }


    public void add(Integer monthNumber, String monthName) {
        this.calendar.put(monthNumber,monthName);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) throws NullPointerException{
        if(!calendar.containsKey(monthNumber)){
            return null;
        }
        return calendar.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        for(Integer ordial : calendar.keySet()) {
            if (calendar.get(ordial).equals(monthName)) {
                return ordial;
            }
        }
        return 0;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return calendar.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return calendar.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return calendar.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

    }
}
