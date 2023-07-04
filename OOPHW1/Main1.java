package OOPHW1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList <Animal> animals = new ArrayList<>();
        animals.add(new Cat("Pushok", "white", 3));
        animals.add(new Dog("Tuzik", "black", 5));
        animals.add(new Hen("Ryaba", "red", 1));
        animals.add(new Cow("Burenka", "red", 3));
        for (Animal animal: animals
             ) {
            animal.voice();
            animal.feed(100);
        }
    }
}
