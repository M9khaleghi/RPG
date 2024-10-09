package rpginventorysystem;

// rpginventorysystem.Main.java
public class Main {
    public static void main(String[] args) {
        // Skapa inventarie
        Inventory inventory = new Inventory();

        // Skapa specifika föremål
        Sword sword = new Sword();
        MagicOgreArmor armor = new MagicOgreArmor();
        HealthPotion potion = new HealthPotion();

        // Lägg till föremål i inventariet
        inventory.addItem(sword);
        inventory.addItem(armor);
        inventory.addItem(potion);

        // Visa alla föremål i inventariet
        inventory.showInventory();

        // Demonstrera interaktioner
        sword.equip();  // Utrusta svärdet
        armor.equip();  // Utrusta rustningen
        potion.use();   // Använd hälsodrycken

        // Ta bort ett föremål och visa inventariet igen
        inventory.removeItem(sword);
        inventory.showInventory();
    }
}
