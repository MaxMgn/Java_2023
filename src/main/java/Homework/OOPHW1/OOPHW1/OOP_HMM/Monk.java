package OOP_HMM;

public class Monk extends Wiseman{
    public Monk(String name) {
        super(name, 80, 10, 7, 7, 14, 20);
    }

    @Override
    public String toString() {
        return "Monk{" +
                "name='" + name + '\'' +
                '}';
    }
}
