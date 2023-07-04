package OOPHW1;

public class Cow extends Animal{
    public Cow(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println("moo");
    }
}
