package rocks.zipcode.assessment2.collections;

import java.util.List;

import java.util.HashMap;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    HashMap<String, Integer> account = new HashMap<>();

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        for(String item : strings){
            addItemToInventory(item);
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

        Integer quantity = account.get(item);
        if(quantity == null)
            quantity = 1 ;
        else
            quantity = quantity + 1;
        account.put(item, quantity);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        Integer quantity = account.get(item);
        if(quantity != null)
            account.put(item, quantity-1);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {

        return account.getOrDefault(item,0);
    }
}
