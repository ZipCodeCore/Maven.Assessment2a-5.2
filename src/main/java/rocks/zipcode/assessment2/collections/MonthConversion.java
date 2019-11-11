package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    Map<Integer, String>monthRef = new HashMap<>();

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        monthRef.put(monthNumber, monthName);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) throws NullPointerException{

        if (monthNumber < 1 || monthNumber> 12 || monthNumber==null){
            throw new NullPointerException();
        }
           return monthRef.get(monthNumber);
    }


    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {

        Integer monthNum = null;
        for (Map.Entry<Integer, String> entry : monthRef.entrySet()) {
            if (entry.getValue().equals(monthName)) {
                monthNum = entry.getKey();
            }

        }

        return monthNum;
        }


    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return monthRef.containsKey(monthNumber);

    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return monthRef.containsValue(monthName);

    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return monthRef.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        monthRef.replace(monthNumber, monthName);

    }
}
