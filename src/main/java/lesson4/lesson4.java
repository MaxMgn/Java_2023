package lesson4;

import java.util.LinkedList;
import java.util.Scanner;

public class lesson4 {


// 1. Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида
// text~num

    // Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
    public static void main(String[] args) {
        boolean exit = false;
        LinkedList<String> linkedList = new LinkedList<String>();
        do {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите текст по шаблону 'text~num': ");
            String text = scan.nextLine();
            System.out.println(text);
            if (text.equals("exit")) {
                exit = true;
                break;
            }
            String[] array = text.split("~");
            int index = Integer.parseInt(array[1]);
            //linkedList.add(array[0]);

            if (array[0].equals("print")) {
                System.out.println(linkedList.get(index));
                linkedList.remove(index);
            } else {
                linkedList.add(index, array[0]);
            }
            System.out.println(linkedList);

        } while (true);

//            for (int i = 0; i < parthdd.length; i++) {
//                System.out.println(linkedList);
//            }


        // Line~5
        // [Line,5]
        // Line
    }
}
