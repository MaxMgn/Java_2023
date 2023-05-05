package OOP_HMM;

public class Peasant extends BaseUnit {

    public Peasant(String name) {
        super(name, 10, 1, 4, 1, 2);
    }

    @Override
    public String toString() {
        return "Peasant{" +
                "name='" + name + '\'' +
                '}';
    }
}
