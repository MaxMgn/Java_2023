package OOPHW1;

public class Hen extends Animal{
    public Hen(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println("clunk");
    }
}
