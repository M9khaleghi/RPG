package rpginventorysystem;

public abstract class Item {
    protected String name;
    protected double weight;
    protected int value;

    public Item(String name, double weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public abstract void getInfo();
}
