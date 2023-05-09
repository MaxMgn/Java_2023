package OOP_HMM;

abstract public class BaseUnit implements GameInterface{
    protected String name;
    protected static int maxhp;
    protected int hp;
    protected static int initMinDamage;
    protected static int initMaxDamage;
    protected int minDamage;
    protected int maxDamage;
    protected int damage;
    protected static int initSpeed;
    protected int speed;
    protected int luck;
    protected int morale;

    protected int initiativity;
    protected boolean defence = false;
    public BaseUnit(String name, int maxhp, int initiativity, int initSpeed, int initMinDamage, int initMaxDamage) {
        this.name = name;
        this.hp = maxhp;
        this.minDamage = initMinDamage;
        this.maxDamage = initMaxDamage;
        this.speed = initSpeed;
        this.luck = 0;
        this.morale = 0;
        this.initiativity = initiativity;
    }
    public void move(int distToMove){

    }
    public void attack(){

    }
    public void waitForEnemiesTurn(){

    }
    public void defend(){
        defence = true;
    }
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getLuck() {
        return luck;
    }

    public int getMorale() {
        return morale;
    }

    @Override
    public String toString() {
        return name + " hp: " + hp;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Name: " + this.name + "HP: " + this.hp + ", minDamage: " + this.minDamage + ", maxDamage: " + this.maxDamage + ", speed: " + this.speed;
    }

}
