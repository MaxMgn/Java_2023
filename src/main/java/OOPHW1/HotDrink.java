package OOPSem;

public class HotDrink extends Drink{
    int temperature;
    public HotDrink(String name, int price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                " volume=" + volume +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", temperature=" + temperature +
                '}';
    }
}
