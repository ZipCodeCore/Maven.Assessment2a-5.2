package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    Map<Integer,String> monthList = new TreeMap<>();

    public void add(Integer monthNumber, String monthName) {
        monthList.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) throws NullPointerException {

        try {
            return monthList.get(monthNumber);
        } catch (NullPointerException e){
            return  e.getMessage();
        }

    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        int result = 0;
        for (Map.Entry<Integer,String> value : monthList.entrySet()){
            if (monthName.equals(value.getValue())){
                result = value.getKey();
                return result;
            }
        }
        return result;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return monthList.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return monthList.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return monthList.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        monthList.replace(monthNumber,monthName);
    }
}
