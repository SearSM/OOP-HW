import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    private List<Drink> drinkList = new ArrayList<>();

    @Override
    public void initDrink(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }

    @Override
    public Drink getDrink(String name, int volume) {
        for (Drink item : drinkList)
            if (item.getName().equals(name) && item.getVolume() == volume)
                return item;
        return null;
    }

    public Drink getDrink(String name, int volume, int temperature) {
        for (Drink item : drinkList)
            if (item.getName().equals(name) && item.getVolume() == volume && ((HotDrink) item).getTemperature() == temperature)
                return item;
        return null;
    }
}
