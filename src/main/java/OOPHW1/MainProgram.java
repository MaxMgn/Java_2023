package OOPSem;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainProgram {
    public static void main(String[] args) {

        HotDrinksVendingMachine hdvm = new HotDrinksVendingMachine();

        HotDrink coffee = new HotDrink("coffee", 30, 300, 75);
        HotDrink hotTea = new HotDrink("hotTea", 30, 400, 90);
        ArrayList<HotDrink> list = new ArrayList<>();
        list.add(coffee);
        list.add(hotTea);
        hdvm.putProducts(list);
        System.out.println(hdvm.getProduct("coffee", 300, 75));
    }
}
