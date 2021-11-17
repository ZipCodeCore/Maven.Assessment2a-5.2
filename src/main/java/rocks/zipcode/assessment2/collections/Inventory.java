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
    Map<String, Integer> inventory = new HashMap<String, Integer>();

    public Inventory(List<String> strings) {
        for(String string : strings) {
            if (inventory.containsKey(string) == false){
                inventory.put(string,1);
            }
            else if (inventory.containsKey(string) == true){
                Integer newStock = Integer.valueOf(inventory.get(string)) + 1;
                inventory.replace(string, newStock);
            }
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
        if (this.inventory.containsKey(item) == false){
            inventory.put(item,1);
        }
        else if (inventory.containsKey(item) == true){
            Integer newStock = Integer.valueOf(inventory.get(item)) + 1;
            inventory.replace(item, newStock);
        }    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        if (inventory.containsKey(item) == true){
            Integer newStock = Integer.valueOf(inventory.get(item)) - 1;
            inventory.replace(item, newStock);
        }
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        if(inventory.containsKey(item)) {
            return Integer.valueOf(inventory.get(item));
        }
        return 0;
    }
}
