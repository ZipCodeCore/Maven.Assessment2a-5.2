package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    private HashMap<Integer, String> monthConversionMap;
    private Integer monthNumber;
    private String monthName;

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */

    public MonthConversion()    {
        monthConversionMap = new HashMap<Integer, String>();


    }


    public void add(Integer monthNumber, String monthName) {
        this.monthNumber = monthNumber;
        this.monthName = monthName;

        monthConversionMap.put(monthNumber, monthName);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new NullPointerException("Invalid Number");
        }
         return monthConversionMap.get(monthNumber);

    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        Object key = null;
        for(Map.Entry entry: monthConversionMap.entrySet()) {
            if(monthName.equals(entry.getValue())) {
                key = entry.getKey();
            }   else    {
                key = null;
                break;
            }
        }

        return (Integer)key;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return monthConversionMap.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return null;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return monthConversionMap.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

    }
}
