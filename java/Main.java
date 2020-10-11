public class Main {
    public static void main(String[] args) {
        Drink vodka = new AlcoholicDrink(4, "vodka", 25);
        Drink appelsap = new NonAlcoholicDrink(1, "sapje", true);

        Cafe cafe = new Cafe();
        cafe.AddDrink(vodka);
        cafe.AddDrink(appelsap);
        cafe.Display();
    }
}
