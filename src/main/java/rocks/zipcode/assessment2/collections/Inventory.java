package rocks.zipcode.assessment2.collections;

import java.util.*;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    Map<String, Integer> inventory = new HashMap<>();
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        for(String s: strings){
            inventory.put(s, 1);
        }

    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if(!inventory.containsKey(item)){
            inventory.put(item, 1);
        }else{
            inventory.put(item, inventory.get(item) + 1);
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        if(inventory.containsKey(item) && inventory.get(item) != 0){
            inventory.put(item, inventory.get(item) - 1);
        }
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        if (!inventory.containsKey(item)){
            return 0;
        }
        return inventory.get(item);
    }
}
