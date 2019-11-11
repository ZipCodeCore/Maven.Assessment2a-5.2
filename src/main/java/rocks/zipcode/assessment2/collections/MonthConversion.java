package rocks.zipcode.assessment2.collections;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    TreeMap<Integer, String> month = new TreeMap<>();
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        month.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

        //throw new NullPointerException();
        return month.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName){
        Set set = month.entrySet();
        Iterator i = set.iterator();
        Integer result = null;
        while(i.hasNext()){
            Map.Entry map = (Map.Entry) i.next();
            if(monthName.equals(map.getValue())){
                result = (Integer)map.getKey();
            }
        }

        return result;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        if(month.containsKey(monthNumber)){
            return true;
        }
        return false;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        if(month.containsValue(monthName)){
            return true;
        }
        return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return month.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        month.put(monthNumber, monthName);
    }

}
