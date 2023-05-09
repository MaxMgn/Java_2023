package OOP_HMM;

public class Crossbowman extends OOP_HMM.Shooter {
//    protected static int maxhp = 50;
//    protected static int initMinDamage = 3;
//    protected static int initMaxDamage = 5;
//    protected static int initMinShootingDamage = 15;
//    protected static int initMaxShootingDamage = 20;
//    protected static int initSpeed = 4;
// protected static int initiativity = 3;
    public Crossbowman(String name) {
        super(name, 50, 3, 4, 3, 5, 9, 9, 15, 20);
    }

    @Override
    public String toString() {
        return "Crossbowman{" +
                "name='" + name + '\'' +
                '}';
    }
}
