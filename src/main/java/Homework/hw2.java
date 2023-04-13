package Homework;

import java.io.FileWriter;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class hw2 {
    public static void main(String[] args) {

        //System.out.println(jsonParser("{ { \"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}}"));
        //String strToParse = "{ { \"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}}";
        // writeToFile(jsonParser(strToParse), "file.txt");
        int arrToSortSize = 10;
        int[] arrToSort = createArray(arrToSortSize);
        printArray("before sorting: ", arrToSort);
        int[] arr2 = bubbleSort(arrToSort);
        printArray("after bubble sorting: ", arrToSort);

    }

    public static String jsonParser(String jsonStrToParse) {
        StringBuilder parsedStr = new StringBuilder();
        jsonStrToParse = jsonStrToParse.replace("{{", "");
        jsonStrToParse = jsonStrToParse.replace("}}", "");
        String[] records = jsonStrToParse.split("\\},\\{");
        int valuesNumberInRecord = 3;
        String[][] keyValuePairs = new String[valuesNumberInRecord][records.length];
        int kvp = 0;
        for (String record : records) {
            keyValuePairs[kvp] = record.split(",");
            kvp++;
        }
        for (int i = 0; i < keyValuePairs.length; i++) {
            parsedStr.append("Студент ");
            parsedStr.append(keyValuePairs[i][0].split(":")[1].replace("\"", ""));
            parsedStr.append(" получил ");
            parsedStr.append(keyValuePairs[i][1].split(":")[1].replace("\"", ""));
            parsedStr.append(" по предмету ");
            parsedStr.append(keyValuePairs[i][2].split(":")[1].replace("\"", ""));
            parsedStr.append(". ");
        }

        return parsedStr.toString();
    }

    static void writeToFile(String s, String filePath) {
//        File file = new File(filePath);
//        if (!file.exists()){
//            try {
//                file.createNewFile();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
        try {
            Logger logger = Logger.getAnonymousLogger();
            FileHandler fileHandler = new FileHandler("log.txt", false);
            logger.addHandler(fileHandler);
//            SimpleFormatter formatter = new SimpleFormatter();
//            fileHandler.setFormatter(formatter);
            try (FileWriter writer = new FileWriter(filePath, false)) {
                writer.write(s);
                writer.flush();
                logger.log(Level.INFO, "запись успешно создана");
            } catch (Exception e) {
                e.printStackTrace();
                logger.log(Level.WARNING, e.getMessage());
            }
            fileHandler.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int[] bubbleSort(int[] arrToSort) {
        int temp = 0;
        for (int j = 0; j < arrToSort.length; j++) {
            for (int i = 0; i < arrToSort.length - 1; i++) {
                if (arrToSort[i] > arrToSort[i + 1]) {
                    temp = arrToSort[i];
                    arrToSort[i] = arrToSort[i + 1];
                    arrToSort[i + 1] = temp;
                }
            }
        }
        return arrToSort;
    }

    public static int[] createArray(int arrSize) {
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static void printArray(String desription, int[] arrToBePrinted) {
        System.out.print(desription + "[");
        for (int i = 0; i < arrToBePrinted.length; i++) {
            Random random = new Random();

            if (i != arrToBePrinted.length - 1) {
                System.out.print(arrToBePrinted[i] + ", ");
            }
        }
        System.out.print(arrToBePrinted[arrToBePrinted.length - 1] + "]");
    }
}
