package Homework;

import java.util.*;

public class Notebook {

    private String name;
    private int RAM;
    private int HDD;
    private String OS;
    private String color;

    public Notebook(String name, int RAM, int HDD, String OS, String color) {
        this.name = name;
        this.RAM = RAM;
        this.HDD = HDD;
        this.OS = OS;
        this.color = color;
    }

    public static HashSet<Notebook> filter (HashSet<Notebook> notebooks){
        HashSet<Notebook> notebooksFiltered = new HashSet<>();
        HashMap<String, String> criteria = new HashMap<>();
        Scanner Scan = new Scanner(System.in);
        String criterion = "";
        while (criterion.equals("") || criterion.equals("1") || criterion.equals("2") || criterion.equals("3") || criterion.equals("4")) {
            System.out.println("“Введите цифру, соответствующую необходимому критерию:\n" +
                    "1 - ОЗУ\n" +
                    "2 - Объем ЖД\n" +
                    "3 - Операционная система\n" +
                    "4 - Цвет");
            criterion = Scan.nextLine();
            if (criterion == "") {
                continue;
            }
            System.out.println("“Введите значения критерия");
            String criterionValue = Scan.nextLine();
            criteria.put(criterion, criterionValue);
            System.out.println(criteria);
        }
        Iterator <Notebook> iterNotebooks = notebooks.iterator();
        Iterator iterCriteria = criteria.entrySet().iterator();
        //System.out.println(notebooks);
        boolean filtered = false;
        while (iterNotebooks.hasNext()){
            filtered = false;
            Notebook notebook = iterNotebooks.next();
            while (iterCriteria.hasNext()) {
                Map.Entry entry = (Map.Entry) iterCriteria.next();
                //System.out.println(Integer.parseInt((String) entry.getValue()));
                if (entry.getKey().equals("1") && notebook.getRAM() <  Integer.parseInt((String) entry.getValue())){
                    filtered = true;
                    break;
                }
                if (entry.getKey().equals("2")  && notebook.getHDD() < Integer.parseInt((String) entry.getValue())){
                    System.out.println(Integer.parseInt((String) entry.getValue()));
                    filtered = true;
                    break;
                }
                if (entry.getKey().equals("3") && !notebook.getOS().equals(entry.getValue())){
                    filtered = true;
                    break;
                }
                if (entry.getKey().equals("4") && !notebook.getColor().equals(entry.getValue())){
                    System.out.println("filtered");
                    filtered = true;
                    break;
                }
            }
            if (!filtered){
                notebooksFiltered.add(notebook);
            }

        }
        return notebooksFiltered;
    }
    public String getName() {
        return name;
    }
    public int getRAM() {
        return RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public String getOS() {
        return OS;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", RAM=" + RAM +
                ", HDD=" + HDD +
                ", OS='" + OS + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
