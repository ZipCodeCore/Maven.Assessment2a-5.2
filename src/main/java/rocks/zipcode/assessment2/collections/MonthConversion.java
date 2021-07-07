package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    Map<Integer, String> calendar = new HashMap<>();
    public void add(Integer monthNumber, String monthName) {
        calendar.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        try{
        return calendar.get(monthNumber);}
        catch (NullPointerException e){

            return null;}
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        Integer result = 0;
        for (Map.Entry<Integer, String> entry : calendar.entrySet()) {
            if (entry.getValue().contains(monthName)) {
                result = entry.getKey();
            }
        }
        return result;

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
        calendar.replace(monthNumber,monthName);

    }
}
