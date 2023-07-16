package OOPHW4;

import java.util.ArrayList;
import java.util.Collection;

public class Box <F extends Fruit>{
    ArrayList <F> fruits;

    public Box() {
        fruits = new ArrayList <F>();
    }
    public void add(F fruit){
        fruits.add(fruit);
    }
    public int getWeight(){
        int weight = 0;
        for (F fruit:fruits
             ) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void moveTo(Box <? super F> box){
        box.fruits.addAll(fruits);
        fruits.clear();
    }
}
