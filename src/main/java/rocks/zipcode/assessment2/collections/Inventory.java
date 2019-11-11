package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    private Map<String, Integer> inv;
    private List<String> strings;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.strings = strings;
        this.inv = new HashMap<>(); 
        for (int i = 0; i <strings.size() ; i++) {
            addItemToInventory(strings.get(i));
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
    this.inv = new HashMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if(inv.containsKey(item)){
            inv.put(item,inv.get(item)+1);
        }else{
            inv.put(item,1);
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        if(inv.containsKey(item)){
            inv.put(item,inv.get(item)-1);
        }

    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
//        if(inv.containsKey(item)){
//            return inv.get(item);
//        }else return 0;

        return inv.getOrDefault(item, 0);

    }
}
