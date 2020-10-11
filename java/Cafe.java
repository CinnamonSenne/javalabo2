import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cafe {
    private List<Drink> drinkList = new ArrayList<Drink>();

    public Cafe() {
    }

    public void AddDrink(Drink drink){
        drinkList.add(drink);
    }

    public void Display(){
        for (Drink x:drinkList
             ) {
            System.out.println(x);
        }
    }
}
