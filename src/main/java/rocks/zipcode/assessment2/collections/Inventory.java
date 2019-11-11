package rocks.zipcode.assessment2.collections;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    TreeMap<String,Integer> inVentoryMap = new TreeMap();
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        for (String s : strings) {
            inVentoryMap.put(s, 0);
        }
    }


    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        inVentoryMap.put("", 0);

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if (!inVentoryMap.containsKey(item)){
            inVentoryMap.put(item, 0);
        }else{
            inVentoryMap.put(item, inVentoryMap.get(item) + 1);
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        inVentoryMap.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return inVentoryMap.get(item);
    }
}
