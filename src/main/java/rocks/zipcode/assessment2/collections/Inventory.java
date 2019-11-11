package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

    List<String> newList = new ArrayList<>();
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        newList = strings;
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
        newList.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        newList.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        int result = 0;
        for (String value : newList){
            if (newList.contains(value)) result ++;
        }
        return result;
    }
}
