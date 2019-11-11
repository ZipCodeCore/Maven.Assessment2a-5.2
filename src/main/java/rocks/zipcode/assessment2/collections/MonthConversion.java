package rocks.zipcode.assessment2.collections;

import java.util.HashMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    public HashMap<Integer,String> calendar = new HashMap<>();
    public HashMap<String, Integer> reverseCalendar = new HashMap<>();

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        calendar.put(monthNumber,monthName);
        reverseCalendar.put(monthName,monthNumber);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) { return calendar.get(monthNumber); }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        return reverseCalendar.get(monthName);
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) { return calendar.containsKey(monthNumber); }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) { return calendar.containsValue(monthName); }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() { return calendar.size(); }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        calendar.remove(monthNumber);
        reverseCalendar.remove(monthName);
        calendar.put(monthNumber, monthName);
        reverseCalendar.put(monthName, monthNumber);
    }
}
