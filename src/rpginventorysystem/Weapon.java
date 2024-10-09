package rpginventorysystem;

public class Weapon extends Item implements Equippable {
    private int damage;

    public Weapon(String name, double weight, int value, int damage) {
        super(name, weight, value);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void equip() {
        System.out.println(name + " equipped. Damage: " + damage);
    }

    @Override
    public void getInfo() {
        System.out.println("rpginventorysystem.Weapon: " + name + ", Weight: " + weight + ", Value: " + value + ", Damage: " + damage);
    }
}
