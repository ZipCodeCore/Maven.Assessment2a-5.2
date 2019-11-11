package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    private Map<Integer , String> months = new HashMap<>();
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        months.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        try {
            if (months.containsKey(monthNumber)) {
                return months.get(monthNumber);
            }
        }catch(NullPointerException e) {
            return null;
        }
        return null;
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) throws NullPointerException{
    for (Map.Entry<Integer, String> entry : months.entrySet()) {
        if (entry.getValue().equals(monthName)) {
            return entry.getKey();
        }
    }
    return (Integer) null;
}

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return months.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        for (Map.Entry<Integer, String> entry : months.entrySet()) {
            if (entry.getValue().equals(monthName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return months.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
    months.put(monthNumber,monthName);
    }
}
