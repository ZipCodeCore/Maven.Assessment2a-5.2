package rocks.zipcode.assessment2.collections;

import java.util.*;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

    HashMap<String, List<String>> map = new HashMap<>();
    List<String> strings;


    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.strings = strings;
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this(new ArrayList<>());
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        this.map.put(item, new ArrayList<>());
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        this.map.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
       return this.map.get(item).size();
    }
}
