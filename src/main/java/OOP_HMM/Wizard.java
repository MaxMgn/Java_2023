package OOP_HMM;

public class Wizard extends Wiseman{

    public Wizard(String name) {
        super(name, 50, 5, 7, 5, 7, 40);

    }

    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                '}';
    }
}
