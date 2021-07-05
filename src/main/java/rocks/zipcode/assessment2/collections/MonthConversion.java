package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    Map<Integer, String> monthMap;

    public MonthConversion() {
        this.monthMap = new HashMap<>();
    }

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName   - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        monthMap.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        String name = null;
        if(monthMap.containsKey(monthNumber)) {
            for (Map.Entry<Integer, String> entry : monthMap.entrySet()) {
                if (entry.getKey() == monthNumber)
                    name = entry.getValue();
            }
        }
        return name;
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Integer ordinal = null;
        if(monthMap.containsValue(monthName)) {
            for (Map.Entry<Integer, String> item : monthMap.entrySet()) {
                if (item.getValue().equals(monthName))
                    ordinal = item.getKey();
            }
        }
        return ordinal;
    }

        /**
         * @param monthNumber
         * @return true if the monthNumber is in the keySet
         */
        public Boolean isValidNumber (Integer monthNumber){
            return monthMap.containsKey(monthNumber);
        }

        /**
         * @param monthName
         * @return true if the monthName is in the valueSet
         */
        public Boolean isValidMonth (String monthName){
            return monthMap.containsValue(monthName);
        }

        /**
         * @return number of entries in this mapping
         */
        public Integer size () {
            return monthMap.size();
        }

        /**
         * @param monthNumber - number of month in year
         * @param monthName   - name of month
         */
        public void update (Integer monthNumber, String monthName){
            monthMap.put(monthNumber, monthName);
        }
    }
