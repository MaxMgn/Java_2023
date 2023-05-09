package hw1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        //System.out.println(triangleNumbers(100));
        //System.out.println(factorial(10));
//        List <Integer> primeList = primeNumbers(100);
//        for (Integer prime : primeList) {
//            System.out.printf("%d, ", prime);;
//            }
        System.out.println(calc());
    }
    public static int triangleNumbers (int num){
        if (num == 0){
            return 0;
        }
        else {
            return num + triangleNumbers(--num);
        }
    }
    public static long factorial (int num){
        if (num == 0 || num == 1){
            return 1;
        }
        else {
            return num * factorial(--num);
        }
    }
    public static List primeNumbers (int num){
        List <Integer> primeNumbersList  = new ArrayList<>();
        primeNumbersList.add(0, 2) ;
        int i = 3;
        while (i < num) {
            int j = 0;
            while (j < primeNumbersList.size()){
                    if (i % primeNumbersList.get(j) == 0){
                        i++;
                        j = 0;
                }
                j++;
            }
            primeNumbersList.add(i++);
        }
        return primeNumbersList;
    }
    public static String calc() {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Input 1st number:");
        int num1 = Scan.nextInt();
        System.out.println("Input 2nd number:");
        int num2 = Scan.nextInt();
        Scan.nextLine();
        System.out.println("Input operation");
        String oper = Scan.next();
        switch (oper) {
            case "+":
                return Integer.toString(num1 + num2);
            case "-":
                return Integer.toString(num1 - num2);
            case "*":
                return Integer.toString(num1 * num2);
            case "/":
                if (num2 == 0) {
                    return "Division by zero error";
                } else {
                    double scale = Math.pow(10, 3);
                    return Double.toString(Math.round(1.0 * num1 / num2 * scale) / scale);
                }
            default:
                return "Wrong operation";
        }
    }

    public static String equation(String eq) {
        String[] splitEq = eq.split("=");
        char[] addend1 = splitEq[0].split("\\+")[0].toCharArray();
        char[] addend2 = splitEq[0].split("\\+")[1].toCharArray();
        char[] sum = splitEq[1].toCharArray();
        int nextDigit = 0; // перенос на следующий разряд, если сумма больше 9
        for (int i = 0; i < sum.length; i++) {
            if (addend1[sum.length - 1 - i] == '?') {
                if (sum[sum.length - 1 - i] == '?' || addend2[sum.length - 1 - i] == '?') {
                    return "The equation can't be resolved";
                } else if (sum[sum.length - 1 - i] - addend2[sum.length - 1 - i] - nextDigit < 0) {
                    addend1[sum.length - 1 - i] = (char) (sum[sum.length - 1 - i] - addend2[sum.length - 1 - i] - nextDigit + 10);
                    nextDigit = 1;
                } else {
                    addend1[sum.length - 1 - i] = (char) (sum[sum.length - 1 - i] - addend2[sum.length - 1 - i] - nextDigit);
                    nextDigit = 0;
                }
            } else if (addend2[sum.length - 1 - i] == '?') {
                if (sum[sum.length - 1 - i] == '?' || addend1[sum.length - 1 - i] == '?') {
                    return "The equation can't be resolved";
                } else if (sum[sum.length - 1 - i] - addend2[sum.length - 1 - i] - nextDigit < 0) {
                    addend2[sum.length - 1 - i] = (char) (sum[sum.length - 1 - i] - addend1[sum.length - 1 - i] - nextDigit + 10);
                    nextDigit = 1;
                } else {
                    addend2[sum.length - 1 - i] = (char) (sum[sum.length - 1 - i] - addend1[sum.length - 1 - i] - nextDigit);
                    nextDigit = 0;
                }

            } else if (sum[sum.length - 1 - i] == '?') {
                if (addend1[sum.length - 1 - i] == '?' || addend2[sum.length - 1 - i] == '?') {
                    return "The equation can't be resolved";
                } else if (addend1[sum.length - 1 - i] + addend2[sum.length - 1 - i] + nextDigit > 10) {
                    sum[sum.length - 1 - i] = (char) (addend1[sum.length - 1 - i] + addend2[sum.length - 1 - i] + nextDigit - 10);
                    nextDigit = 1;
                } else {
                    sum[sum.length - 1 - i] = (char) (addend1[sum.length - 1 - i] + addend2[sum.length - 1 - i] + nextDigit);
                    nextDigit = 0;
                }

            } else if (addend1[sum.length - 1 - i] + addend2[sum.length - 1 - i] != sum[sum.length - 1 - i]) {
                return "The equation can't be resolved";
            }
        }
        String strEq = addend1.toString() + " + " + addend2.toString() + " = " + sum.toString();
        return strEq;

    }
}



