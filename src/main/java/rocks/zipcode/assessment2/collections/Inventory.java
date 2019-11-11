package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    List<String> strings;
    Map<String, Integer> inventoryMap;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.inventoryMap = new HashMap<String, Integer>();
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.strings = new ArrayList<String>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        for(Map.Entry<String, Integer> entry: inventoryMap.entrySet()) {
            if(entry.getKey().equals(item)) {
                //entry.getValue() = entry.getValue() + 1;
            }
        }
        //return;
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        inventoryMap.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return inventoryMap.get(item);
    }
}
