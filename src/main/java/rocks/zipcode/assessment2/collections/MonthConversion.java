package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Use a map to solve
 */
public class MonthConversion {
    private Map<Integer, String> months;
    public MonthConversion() {
        this.months = new HashMap<Integer, String>();
    }
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        if (!this.months.containsValue(monthName) && !this.months.containsKey(monthNumber)) {
            this.months.put(monthNumber, monthName);
        }
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        String monthName = null;
        if (this.months.containsKey(monthNumber)) {
            monthName = this.months.get(monthNumber);
        }
        return monthName;
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Integer monthNumber = null;
        Set keys = this.months.keySet();
        for (Object key : keys) {
            if (this.months.get(key).equals(monthName)) {
                monthNumber = (Integer) key;
                break;
            }
        }
        return monthNumber;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return (this.months.containsKey(monthNumber));
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return (this.months.containsValue(monthName));
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return this.months.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        this.months.put(monthNumber, monthName);

    }
}
