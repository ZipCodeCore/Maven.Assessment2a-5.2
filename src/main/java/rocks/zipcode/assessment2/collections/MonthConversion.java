package rocks.zipcode.assessment2.collections;

import java.util.AbstractMap;
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
    Map<Integer, String > monthHashMap = new HashMap<>();

    public void add(Integer monthNumber, String monthName) {
        monthHashMap.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

        //throw new NullPointerException();
        return monthHashMap.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Integer key=null;
        for(Map.Entry<Integer,String>entry:monthHashMap.entrySet())
            if(entry.getValue().equals(monthName)){
                key= entry.getKey();}
        return key;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {

        if(monthHashMap.containsKey(monthNumber))
            return true;
        else
            return false;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        if(monthHashMap.containsKey(monthName))
            return true;
        else
            return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return monthHashMap.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        monthHashMap.replace(monthNumber, monthName);

    }
}
