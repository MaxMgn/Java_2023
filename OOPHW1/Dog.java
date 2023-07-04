package OOPHW1;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("woof");
    }

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
}
