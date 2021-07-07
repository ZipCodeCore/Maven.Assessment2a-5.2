package rocks.zipcode.assessment2.collections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     *
     */
    private Map<Integer, String> months;
    public MonthConversion(){
        this.months = new LinkedHashMap<>();
    }

    public void add(Integer monthNumber, String monthName) {
        this.months.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        if(months.containsKey(monthNumber)){
            return this.months.get(monthNumber);
        }
        return null;

    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        for(Integer each : months.keySet()){
            if(months.get(each).equals(monthName))
                return each;
        }

        return null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return this.months.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        for(String each : months.values() ){
            if(each.equals(monthName))
                return true;
        }
        return false;
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
        this.months.replace(monthNumber, monthName);
    }
}
