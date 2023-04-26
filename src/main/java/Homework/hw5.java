package Homework;

import java.util.*;

public class hw5 {
    public static void main(String[] args) {
        //telbook();
        employeesNamesSort();
    }
    public static void telbook(){
        HashMap <String, ArrayList> telbook = new HashMap<>();
        Scanner Scan = new Scanner(System.in);
        System.out.println("Input operation");
        String oper = Scan.nextLine();
        while (true){
            //System.out.println(oper);
            if (oper.equals("add")){
                System.out.println("Input name and surname");
                String key = Scan.nextLine();
                if (telbook.containsKey(key)){
                    System.out.println("Input telephone");
                    String telephone = Scan.nextLine();
                    telbook.get(key).add(telephone);
                }
                else{
                    ArrayList<String> record = new ArrayList<>();
                    System.out.println("Input telephone");
                    String telephone = Scan.nextLine();
                    record.add(telephone);
                    telbook.put(key, record);

                }
            }
            else if (oper.equals("print")){
                System.out.println("Input name and surname");
                String key = Scan.nextLine();
                if (telbook.containsKey(key)) {
                    for (int i = 0; i < telbook.get(key).size(); i++) {
                        System.out.println(telbook.get(key).get(i));
                    }
                }
                else{
                    System.out.println("The name is absent in the telbook");

                }
            }
            else if (oper.equals("exit")){
                break;
            }
            System.out.println("Input operation");
            oper = Scan.nextLine();
        }

    }
    public static void employeesNamesSort(){
        String employeesNames = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, " +
                "Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, " +
                "Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.";
        String [] employeesArray = employeesNames.split(", ");

        HashMap <String, Integer> employeesNamesMap = new HashMap();
        int count = 0;
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesNamesMap.containsKey(employeesArray[i].split(" ")[0])){
                count = employeesNamesMap.get(employeesArray[i].split(" ")[0]);
                employeesNamesMap.put(employeesArray[i].split(" ")[0], ++count);
            }
            else{
                employeesNamesMap.put(employeesArray[i].split(" ")[0], 1);
            }
        }
        TreeMap <Integer, ArrayList> Tmap = new TreeMap<>();
        Iterator iter = employeesNamesMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            if (Tmap.containsKey(entry.getValue())){
                Tmap.get(entry.getValue()).add(entry.getKey());
            }
            else {
                ArrayList<String> record = new ArrayList<>();
                record.add((String) entry.getKey());
                Tmap.put((Integer) entry.getValue(), record);
            }
        }

        System.out.println(Tmap);
    }
}
