package rocks.zipcode.assessment2.collections;

import java.util.*;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    ArrayList<String> strings;
    Map<String, Integer> map;
    Set<String> set;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(ArrayList<String> strings) {
        this.strings = strings;
        this.map = new HashMap<>();
//        for (String item : new HashSet<>(this.strings)) {
//            this.map.put(item, Collections.frequency(strings, item));
//        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.strings = new ArrayList<>();
//        this.map = new HashMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if (!map.containsKey(item)) {
            map.put(item, 1);
        } else {
            //newQty = newQty + map.get(item);
            map.replace(item, map.get(item) + 1);
        }
    }


    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        Integer qty = 0;

        //for(String item: items) {
        if (!map.containsKey(item))
            map.put(item, 1);
        else {
            qty = map.get(item);
            map.put(item, qty--);
        }
    }


    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return map.get(item);
    }
}
