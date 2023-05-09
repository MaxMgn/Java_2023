package MainHMMProgram;

import OOP_HMM.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainProgram {
    public static void main(String[] args) {
        List <BaseUnit> team1 = new ArrayList<>();
        List <BaseUnit> team2 = new ArrayList<>();
        team1.add(new Sniper("Michael"));
        team1.add(new Monk("Martin"));
        team1.add(new Peasant("John"));
        team1.add(new Spearman("William"));
        team2.add(new Crossbowman("Matthew"));
        team2.add(new Rogue("Fox"));
        team2.add(new Wizard("Merlin"));
        team2.add(new Peasant("Peter"));

    }
}
