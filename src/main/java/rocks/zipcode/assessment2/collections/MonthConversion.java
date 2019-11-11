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
    HashMap<Integer,String> hm = new HashMap<Integer,String>();
    public MonthConversion()
    {
     /*   hm.put(1,"January");
        hm.put(2,"February");
        hm.put(3,"March");
        hm.put(4,"April");
        hm.put(5,"May");
        hm.put(6,"June");
        hm.put(7,"July");
        hm.put(8,"August");
        hm.put(9,"September");
        hm.put(10,"October");
        hm.put(11,"November");
        hm.put(12,"December"); */
    }

    public void add(Integer monthNumber, String monthName) {

        hm.put(monthNumber,monthName);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return hm.get(monthNumber).toString();

    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        Integer key = 0;
        for(Map.Entry<Integer, String> entry : hm.entrySet()) {
            if (entry.getValue() == monthName) {
                key = entry.getKey();
            }

        }
        return key;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return hm.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return hm.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return hm.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        hm.replace(monthNumber,monthName);

    }
}
