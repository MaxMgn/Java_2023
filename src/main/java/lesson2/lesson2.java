package lesson2;

import java.io.FileWriter;
import java.util.Scanner;

public class lesson2 {
//    Дано четное число N (>0) и символы c1 и c2.
//    Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1
//   2. Напишите метод, который сжимает строку.
//    Пример: вход aaaabbbcdd
//

    public static void main(String[] args) {
        int number = 8;
        String c1 = "a";
        String c2 = "!";
        String c3 ="aaaabbbcdd";
        //System.out.println(returnString(number, c1, c2));
        //System.out.println(archive(c3));
        System.out.println(letterCount(c3));
        Test();
    }
    public static String returnString (int N, String c1, String c2){
        String result = "";
        for (int i =0; i<N/2; i++){
            result += c1+c2;
        }
        return result;
    }

    public static String archive(String c1){
        c1 += "0";
        int count = 1;
        String result = "";
        for (int i =1; i<c1.length(); i++){
            //System.out.println(c1.charAt(i));
            //System.out.println(result);
            if (c1.charAt(i) == c1.charAt(i-1)){
                count++;
            } else  {
                //System.out.println(c1.charAt(i));
                //System.out.println(result);
                if (count == 1){
                    result += "" + c1.charAt(i-1);
                } else{
                    result += "" + c1.charAt(i-1) + count;
                    count = 1;
                }

            }
            //System.out.println(count);
        }
        return result;
    }
        public static StringBuilder build(){
            Scanner in = new Scanner(System.in);
            System.out.print("Введите количество элементов массива: ");
            int limit  = in.nextInt();
            System.out.print("Введите первый элемент: ");
            String first = in.next();
            System.out.print("Введите второй элемент: ");
            String second = in.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < limit; i++) {
                sb.append((i % 2 == 0) ? first : second);
            }
            return sb;
        }
        public static StringBuilder letterCount(String str){
            StringBuilder sb = new StringBuilder();
            //String str = "aaaabbbcddeee";
            int count = 1;
            for (int i = 0; i < str.length()- 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)){
                    count++;
                }else {
                    sb.append(str.charAt(i)).append(count);
                    count = 1;
                }
            }
            sb.append(str.charAt(str.length()-1)).append(count);
            return  sb;
        }
    public static void Test(){
        StringBuilder sb = new StringBuilder();
        sb.append("TEST".repeat(100));
        try {
            FileWriter f1 = new FileWriter("test.txt");
            f1.write(String.valueOf(sb));
            f1.flush();
        }catch (Exception e){
            System.out.println("FAIL");
        }
    }
    public static boolean isPolyndrome(String str){

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            };
        }
        return true;
    }
    //System.out.printf("Максимальное число = %d", max)
}
