public class AlcoholicDrink extends Drink{
    private int alcoholPercentage;

    public void setAlcoholPercentage(int alcoholPercentage) {
        if (alcoholPercentage > 0 && alcoholPercentage < 0)
        alcoholPercentage = alcoholPercentage;
        else
            alcoholPercentage = 0;
    }

    public AlcoholicDrink(int price, String name, int alcoholPercentage) {
        super(price, name);
        this.alcoholPercentage = alcoholPercentage;
    }

    @Override
    public String toString() {
        return super.toString() + " Alcohol percentage: " + alcoholPercentage;
    }
}
