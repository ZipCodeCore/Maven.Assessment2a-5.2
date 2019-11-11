package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    ArrayList<String> list;
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(ArrayList<String> strings) {
        this.list = strings;
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.list = new ArrayList<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        list.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        list.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        Integer counter = 0;
        for (String s : list) {
            if (s.equals(item))
                counter++;
        }
        return counter;
    }
}
