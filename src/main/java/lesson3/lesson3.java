package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class lesson3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<String> names = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun",
                "Pluto");
        ArrayList <Integer> numbers = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            numbers.add(rnd.nextInt(100));
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
