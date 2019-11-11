package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.sql.Types.NULL;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    HashMap<Integer,String> hm;
    public MonthConversion()
    {
        this.hm = new HashMap<Integer, String>();
    }

    public void add(Integer monthNumber, String monthName) {
        if (!this.hm.containsValue(monthName) && !this.hm.containsKey(monthNumber)) {
            hm.put(monthNumber, monthName);
        }
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
      //  return hm.get(monthNumber).toString();
        String monthName = null;
        if (this.hm.containsKey(monthNumber)) {
            monthName = this.hm.get(monthNumber);
        }
        return monthName;

    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
       Integer key = null;
        for(Map.Entry<Integer, String> entry : hm.entrySet()) {
            if (entry.getValue() == monthName) {
                key = entry.getKey();
                return (Integer)key;
            }
        }
        return (Integer)key;
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
