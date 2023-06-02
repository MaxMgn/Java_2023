package OOPSem;

import java.util.ArrayList;
import java.util.LinkedList;

public class HotDrinksVendingMachine implements VendingMachine{
    private ArrayList<HotDrink> hotDrinks;

    public HotDrinksVendingMachine () {
        this.hotDrinks = new ArrayList<>();
    }
    public void putProducts(ArrayList<HotDrink> listToInit) {
        this.hotDrinks = listToInit;
    }
    public Product getProduct(String name, int volume, int temperature) {
        for (int i = 0; i < hotDrinks.size(); i++) {
            if (hotDrinks.get(i).name.equals(name) && hotDrinks.get(i).volume == volume &&
                    hotDrinks.get(i).temperature == temperature) {
                return hotDrinks.get(i);
            }
        }
    return null;
    }

    @Override
    public void putProduct(LinkedList<Product> listToInit) {
    }

    @Override
    public Product getProduct() {
        return null;
    }
}
