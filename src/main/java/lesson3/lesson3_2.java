package lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class lesson3_2 {
    public static void main(String[] args) {
        List<String> names = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun",
                "Pluto");
        Random rnd = new Random();
        int count = 0;
        List<String> multinames = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            multinames.add(names.get(rnd.nextInt(names.size())));
        }
        System.out.println(multinames);
        for (int i = 0; i < names.size(); i++) {
            count = 0;
            for (int j = 0; j < multinames.size(); j++) {
                if (names.get(i).equals(multinames.get(j))){
                    count++;
                }
            }
            System.out.println(names.get(i) + " = " + count);
        }
        for (int i = 0; i < multinames.size(); i++) {
            int j = i + 1;
            while (j < multinames.size()) {
                if (multinames.get(i).equals(multinames.get(j))) {
                    multinames.remove(j);
                } else {
                    j++;
                }
            }

        }
        System.out.println(multinames);
    }
}
