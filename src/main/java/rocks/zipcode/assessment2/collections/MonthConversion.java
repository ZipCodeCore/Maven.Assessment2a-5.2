package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
Integer monthNumber;
String monthName;
Map<Integer,String>map;
public MonthConversion(){
    this.map=new HashMap<>();
}

    public MonthConversion(Integer monthNumber, String monthName, Map<Integer, String> map) {
        this.monthNumber = monthNumber;
        this.monthName = monthName;
        this.map = map;
    }


    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        map.put(monthNumber,monthName);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

        //throw new NullPointerException();
       return map.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        int key=0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            key = entry.getKey();
        }
        return key;

        //return (Integer)null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        if(map.containsKey(monthNumber)){return true;}

        return false;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        if(map.containsValue(monthName)){return true;}
        return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {

        return map.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        MonthConversion conversion = new MonthConversion();
        conversion.update(monthNumber,monthName);
    }
}
