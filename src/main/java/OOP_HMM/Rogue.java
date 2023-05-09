package OOP_HMM;

public class Rogue extends BaseUnit{
    public Rogue(String name) {
        super(name, 30, 10, 6, 3, 4);
    }

    @Override
    public String toString() {
        return "Rogue{" +
                "name='" + name + '\'' +
                '}';
    }
}
