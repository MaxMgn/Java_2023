package Homework;

import java.util.*;

import static java.util.List.*;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
//
//
//
//        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
public class hw4 {
    public static void main(String[] args) {
//        List<String> stringList = Arrays.asList("a", "b", "c");
//        List<String> immutableList = List.of("foo", "bar");
        LinkedList <Integer> linkedList  = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);
        System.out.println(ex1(linkedList));
    }
    static LinkedList <Integer>  ex0 (List <Integer> linkedList){
        LinkedList <Integer> revertedList = new LinkedList<Integer>();
        for (int i = 0; i < linkedList.size(); i++) {
            revertedList.push(linkedList.get(i));
        }
        return revertedList;
    }
    static int  ex1 (List <Integer> linkedList) {
        LinkedList<Integer> revertedList = new LinkedList<Integer>();
        int sumOfElements = 0;
        ListIterator<Integer> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            sumOfElements += iterator.next();
//        for (int i = 0; i < linkedList.size(); i++) {
//            sumOfElements += linkedList.get(i);
        }
        return sumOfElements;
    }
}
