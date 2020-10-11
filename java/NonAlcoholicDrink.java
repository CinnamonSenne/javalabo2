public class NonAlcoholicDrink extends Drink{
    private boolean carbonated;

    public NonAlcoholicDrink(int price, String name, boolean carbonated) {
        super(price, name);
        this.carbonated = carbonated;
    }

    @Override
    public String toString() {
        return super.toString() + " Fizzy: " + carbonated;
    }
}
