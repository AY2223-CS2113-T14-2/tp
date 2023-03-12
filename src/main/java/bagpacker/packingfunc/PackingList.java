package bagpacker.packingfunc;

import java.util.ArrayList;

/**
 * PackingList class contains methods to manipulate the users packing list
 */
public class PackingList {


    private static ArrayList<Item> itemList = new ArrayList<>();
    private static int targetIndex = -1;

    /**
     * Getter for itemList
     *
     * @return list of items
     */
    public static ArrayList<Item> getItemList() {
        return itemList;
    }
    /**
     * Adds an item to the list.
     */
    public void addItem(Item toAdd) {
        itemList.add(toAdd);
    }

    /**
     * Removes an item from the list.
     */
    public void deleteItem(Item toDelete) {
        itemList.remove(toDelete);
    }

    /**
     * Marks an item as packed in the list.
     */
    public void packItem(Item toPack) {
        toPack.setPacked(true);
    }

    public static Item get(int targetIndex) {
        return itemList.get(targetIndex);
    }

    /**
     * Returns size of packing list
     */
    public int size(){
        return itemList.size();
    }


}
