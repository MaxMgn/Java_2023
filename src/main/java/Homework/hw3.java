package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class hw3 {
    public static void main(String[] args) {
        ArrayList <Integer> listOfIntegers = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            listOfIntegers.add(random.nextInt(100));
        }
        System.out.println(listOfIntegers);
        ex1(listOfIntegers);
        System.out.println(listOfIntegers);
        ex2(listOfIntegers);
    }
    static void ex1(ArrayList<Integer> listOfIntegers){
        for (int i = 0; i <listOfIntegers.size(); i++)  {
            if (listOfIntegers.get(i) % 2 == 0){
                listOfIntegers.remove(i);
                i--;
            }
        }
    }
    static void ex2(ArrayList<Integer> listOfIntegers){
        long sum = 0;
        for (int i : listOfIntegers) {
            sum += i;
        }
        System.out.printf("minimal: %d, maximal: %d, average: %.2f", Collections.min(listOfIntegers),
                Collections.max(listOfIntegers), listOfIntegers.size() > 0 ? 1.0 * sum / listOfIntegers.size() : 0);
    }
}
