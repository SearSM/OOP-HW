import java.util.List;

public interface VendingMachine {
    public void initDrink(List<Drink> drinkList);
    public Drink getDrink(String name, int volume);
}
