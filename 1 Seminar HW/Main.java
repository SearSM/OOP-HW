import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Drink> drinkList = new ArrayList<>();
        drinkList.add(new HotDrink("First", 100, 10));
        drinkList.add(new HotDrink("Two", 200, 20));
        drinkList.add(new HotDrink("Three", 300, 30));
        drinkList.add(new HotDrink("Four", 400, 40));
        drinkList.add(new HotDrink("Five", 500, 50));
        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();
        vendingMachine.initDrink(drinkList);
        System.out.println(vendingMachine.getDrink("Two", 200, 20));
        System.out.println(vendingMachine.getDrink("First", 100));
        System.out.println(vendingMachine.getDrink("Four", 100, 20));
        Drink test = new HotDrink("Six", 100, 30);
        System.out.println(vendingMachine.getDrink("Six", 100, 30));
        drinkList.add(test);
        System.out.println(vendingMachine.getDrink("Six", 100, 30));
    }
}