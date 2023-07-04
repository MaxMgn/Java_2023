package OOPHW1;

public class Cat extends Animal{
    @Override
    public void voice() {
        System.out.println("Meow");
    }

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }
}
