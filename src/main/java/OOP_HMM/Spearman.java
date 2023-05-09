package OOP_HMM;

public class Spearman extends BaseUnit{
    public Spearman(String name) {
        super(name, 50, 6, 8, 10, 15);
    }

    @Override
    public String toString() {
        return "Spearman{" +
                "name='" + name + '\'' +
                '}';
    }
}
