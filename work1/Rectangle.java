package work1;

// Прямоугольник
public class Rectangle {
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    private int height; // Нарушение OCP: программная сущность была открыта для модификации. Добавил модификатор private
    private int width; // Нарушение OCP: программная сущность была открыта для модификации. Добавил модификатор private

    // Убрал возможность изменения длины и ширины после создания
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
}
