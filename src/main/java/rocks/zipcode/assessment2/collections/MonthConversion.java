package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {

    public Map<Integer, String> month = new HashMap<>();

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {

        month.put(monthNumber, monthName);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        //throw new NullPointerException();

        return month.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {

        for(Map.Entry<Integer, String> entry : month.entrySet()) {
            if (entry.getValue().equals(monthName))
                return entry.getKey();
        }

        return null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {

        for(Map.Entry<Integer, String> entry : month.entrySet()) {
            if (entry.getKey().equals(monthNumber))
                return true;
        }

        return false;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {

        for(Map.Entry<Integer, String> entry : month.entrySet()) {
            if (entry.getValue().equals(monthName))
                return true;
        }

        return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return month.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

        month.replace(monthNumber, monthName);

    }
}
