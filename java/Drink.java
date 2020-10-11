public abstract class Drink {
    private int price;
    private String name;

    public Drink(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ": " + price;
    }
}
