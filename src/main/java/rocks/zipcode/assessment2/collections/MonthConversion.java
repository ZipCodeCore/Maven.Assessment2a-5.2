package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {

    private Map<Integer, String> map = new HashMap<>();

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        map.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    //failed one
    public String getName(Integer monthNumber) {

        return map.get(monthNumber);
    }
    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        for(Integer each: map.keySet()){
            if(map.get(each).contains(monthName)){
                return each;
            }
        }

        return 0;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {

        return map.get(monthNumber) != null || map.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    //failed one
    public Boolean isValidMonth(String monthName) {
        if(map.get(monthName) != null) {
            return true;
        }
        if(map.containsKey(monthName)){
            return true;

        }
        return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return map.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

        map.put(monthNumber,monthName);
    }
}
