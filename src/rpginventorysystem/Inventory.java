package rpginventorysystem;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " added to inventory.");
    }

    public void removeItem(Item item) {
        if (items.remove(item)) {
            System.out.println(item.getName() + " removed from inventory.");
        } else {
            System.out.println(item.getName() + " not found in inventory.");
        }
    }

    public void showInventory() {
        System.out.println("rpginventorysystem.Inventory contains:");
        for (Item item : items) {
            item.getInfo();
        }
    }
}
