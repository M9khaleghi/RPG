package rpginventorysystem;

public class Armor extends Item implements Equippable {
    private int defense;

    public Armor(String name, double weight, int value, int defense) {
        super(name, weight, value);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    @Override
    public void equip() {
        System.out.println(name + " equipped. Defense: " + defense);
    }

    @Override
    public void getInfo() {
        System.out.println("rpginventorysystem.Armor: " + name + ", Weight: " + weight + ", Value: " + value + ", Defense: " + defense);
    }
}
