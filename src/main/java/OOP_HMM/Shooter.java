package OOP_HMM;

abstract public class Shooter extends BaseUnit{
    int numberOfShots;
    static int maxNumberOfShots;
    static int shootingRange;
    static int initMinShootingDamage;
    static int initMaxShootingDamage;
    int minShootingDamage;
    int maxShootingDamage;

    public Shooter(String name, int maxhp, int initiativity, int initSpeed, int initMinDamage, int initMaxDamage, int maxNumberOfShots, int shootingRange,
                   int initMinShootingDamage, int initMaxShootingDamage){

        super(name, maxhp, initiativity, initSpeed, initMinDamage, initMaxDamage);
        this.numberOfShots = maxNumberOfShots;
        this.shootingRange = shootingRange;
        this.minShootingDamage = initMinShootingDamage;
        this.maxShootingDamage = initMaxShootingDamage;

    }
    public void shoot(){

    }

    @Override
    public String getInfo() {
        return super.getInfo()+ ", numberOfShots: " + this.numberOfShots + ", shootingRange: ";
    }
}
