package rocks.zipcode.assessment2.collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */

    List<String>list = new ArrayList<String>();

    public Inventory(List<String> strings) {
        this.list = strings;
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
    List<String> list = new ArrayList<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        list.add(item);
        System.out.println(list);
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
        return list.size();
    }
}
