package Homework;

import java.util.HashSet;

public class hw6 {
    public static void main(String[] args) {
        Notebook  acerExtensa = new Notebook("acer Extensa", 4, 128, "Win 10", "black");
        Notebook  acerAspire = new Notebook("acer Aspire", 4, 256, "Win 11", "black");
        Notebook  xiaomiRedmiBook  = new Notebook("xiaomi RedmiBook", 8, 256, "Win 11", "grey");
        HashSet<Notebook> nbooks = new HashSet<>();
        System.out.println(nbooks.add(acerExtensa));
        nbooks.add(acerAspire);
        nbooks.add(xiaomiRedmiBook);
        //System.out.println(nbooks);
        System.out.println(Notebook.filter(nbooks));
    }

}
