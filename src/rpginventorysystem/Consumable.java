package rpginventorysystem;

public class Consumable extends Item implements Usable {
    private String effect;

    public Consumable(String name, double weight, int value, String effect) {
        super(name, weight, value);
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }

    @Override
    public void use() {
        System.out.println("Using " + name + ". Effect: " + effect);
    }

    @Override
    public void getInfo() {
        System.out.println("rpginventorysystem.Consumable: " + name + ", Weight: " + weight + ", Value: " + value + ", Effect: " + effect);
    }
}
