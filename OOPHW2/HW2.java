package OOPHW2;

public class HW2 {
    public static void main(String[] args) {
        Render render = new Render();

        Building building = new Building(100);
        building.setCurrentHealthPoint(50);

        Hero hero = new Hero(10, 10);
        hero.setCurrentHealthPoint(5);
        hero.setCurrentManaPoint(8);

        Neutral neutral = new Neutral(5);
        neutral.setCurrentHealthPoint(3);

        render.showIndicator(building);
        render.showIndicator(hero);
        render.showIndicator(neutral);
    }
}
