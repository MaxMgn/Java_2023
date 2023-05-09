package OOP_HMM;

/**
 * It is a Sniper
 * */
public class Sniper extends Shooter{
//    protected static int maxhp = 40;
//    protected static int initMinDamage = 2;
//    protected static int initMaxDamage = 3;
//    protected static int initMinShootingDamage = 20;
//    protected static int initMaxShootingDamage = 30;
//    protected static int initSpeed = 4;

    protected static int initiativity = 4;

    /**
     *
     * @param name Имя Снайпер
     */

    public Sniper(String name) {
        super(name, 40, 9, 4, 2, 3, 12, 15,
        20, 30);
    }

    @Override
    public String toString() {
        return "Sniper{" +
                "name='" + name + '\'' +
                '}';
    }
}
