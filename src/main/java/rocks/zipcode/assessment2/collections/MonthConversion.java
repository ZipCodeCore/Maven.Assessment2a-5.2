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
        if (!map.containsValue(monthName) && !map.containsKey(monthNumber))
            map.put(monthNumber,monthName);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

        //throw new NullPointerException();
        String value=null;
        for(Map.Entry<Integer,String> e:map.entrySet()){
            if(e.getKey().equals(monthNumber))
           // if(map.keySet().equals(monthNumber))
             value=e.getValue();

        }
       return value;
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        Integer key=null;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if(entry.getValue().equals(monthName)){
            key = entry.getKey();
            return (Integer)key;}
        }
        return (Integer)key;
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

       map.replace(monthNumber,monthName);
    }
}
