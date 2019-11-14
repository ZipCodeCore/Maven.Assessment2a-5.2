package rocks.zipcode.assessment2.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    private ArrayList<String> strings;
    //private String item;
    //private Map<String, Integer> map;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(ArrayList<String> strings) {
        this.strings = strings;
        //this.map = new LinkedHashMap<>(0);
    }

    /**
     * nullary constructor initializes a new list

     */
    public Inventory() {
        //this.map = new LinkedHashMap<>(0);
        this.strings = new ArrayList<>(0);

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        this.strings.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        this.strings.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        int counter = 0;
        for (String myItem : strings)
            if (myItem.equals(item)){
                counter++;
            }

        return counter;
    }
}
