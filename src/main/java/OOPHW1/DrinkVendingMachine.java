package OOPSem;

import java.util.LinkedList;

public class DrinkVendingMachine implements VendingMachine{
    private LinkedList<Product> drinks;

    public DrinkVendingMachine () {
        this.drinks = new LinkedList<>();
    }

    @Override
    public void putProduct(LinkedList<Product> listToInit) {
        this.drinks = listToInit;
    }

    @Override
    public Product getProduct() {
        return this.drinks.pollLast();
    }
    @Override
    public String toString() {
        return "VendingMachine{" +
                "products=" + drinks +
                '}';
    }
}
