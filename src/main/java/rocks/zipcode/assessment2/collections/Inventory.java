package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    private List<String> strings;
    private String item;
    private Map<String, Integer> map;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.strings = new ArrayList<> (strings);
        this.map = new LinkedHashMap<>(0);
    }

    /**
     * nullary constructor initializes a new list

     */
    public Inventory() {
        this.map = new LinkedHashMap<>(0);
        this.strings = new ArrayList<>(0);

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
//        for (String myItem : strings)
        int preItemQuantity = getItemQuantity(item);
        int postAddedQuantity = preItemQuantity + 1;
        map.put(item, postAddedQuantity);
//
//                (map.get(item));
//        this.strings.add(item);
//        map.put(item, (ArrayList) strings);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        map.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {

        return map.get(item);
    }
}
