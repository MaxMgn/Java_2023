package OOP_HMM;

abstract public class Wiseman extends BaseUnit{
    protected static int maxMana;
    protected int mana;

    public Wiseman(String name, int maxhp, int initiativity, int initSpeed, int initMinDamage, int initMaxDamage, int maxMana) {
        super(name, maxhp, initiativity, initSpeed, initMinDamage, initMaxDamage);
        this.mana = maxMana;
    }
}
