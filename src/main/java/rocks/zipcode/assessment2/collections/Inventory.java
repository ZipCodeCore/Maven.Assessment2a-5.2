package rocks.zipcode.assessment2.collections;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */

    private List<String> inventory;


    public Inventory(List<String> strings) {
        this.inventory = strings;
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.inventory = new LinkedList<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        this.inventory.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        if(inventory.contains(item)){
            inventory.remove(item);
        }
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        Integer quantity = 0;
        for(String each: inventory){
            if(each.equals(item))
                quantity++;
        }
        return quantity;
    }
}
