package MainHMMProgram;

import OOP_HMM.*;

public class MainProgram {
    public static void main(String[] args) {
        BaseUnit michael = new Sniper("Michael");
        System.out.println(michael);
        BaseUnit william = new Crossbowman("William" );
        System.out.println(william);
        BaseUnit martin = new Sniper("Martin");
        System.out.println(martin);
        BaseUnit john = new Peasant("John");
        System.out.println(john);
        BaseUnit fox = new Rogue("Fox");
        System.out.println(fox);
        BaseUnit matthew = new Spearman("Matthew");
        System.out.println(matthew);
        BaseUnit merlin = new Wizard("Merlin");
        System.out.println(merlin);
    }
}
