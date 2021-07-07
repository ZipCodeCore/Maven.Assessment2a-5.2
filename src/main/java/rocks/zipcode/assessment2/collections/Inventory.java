package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    Map<String, Integer> invMap;

    public Inventory(List<String> strings) {
        invMap = new HashMap<>();
        for (String str : strings){
            invMap.put(str, 0);
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        invMap = new HashMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        Integer invAmount  = invMap.getOrDefault(item, 0);
        invMap.put(item, invAmount + 1);
        return;
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        Integer invAmount = invMap.getOrDefault(item,0);
        invAmount -= 1;
        invMap.put(item, invAmount);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return invMap.getOrDefault(item, 0);
    }
}
