package OOPHW1;

public abstract class Animal {
    private String name;
    private   String color;
    private  int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void voice();
    public void feed(int food) {
        System.out.println(name + " ate " + food + " grammes" );
    }

    public void move(int distance) {
        System.out.println(name + "ran" + distance + "meters");
    }

}
