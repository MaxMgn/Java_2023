package les6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//1. 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//        2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//        Для вычисления процента используйте формулу:
//        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
public class lesson6 {
    public static void main(String[] args) {
        //List<Integer> lList = new ArrayList<>();
        List<Integer> lList = fillingArray();
       // percentageUniqueValuesInArray(lList);
    }
    public static List<Integer> fillingArray(){
        List<Integer> lList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            lList.add((int) (Math.random() * 1000));
        }
        return lList;
    }
//    public static int percentageUniqueValuesInArray(List<Integer>lList)  {
//        Set <Integer> = new HashSet<>
//        int percentage = lList.size() / set
//        return percentage;

}
