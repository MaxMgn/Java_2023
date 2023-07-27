package work1;

// Квадрат
public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    // Нарушение LSP. У квадрата не должно быть возможности отдельно задавать длину и ширину. Вместо методов Set, добавил конструктор Убрал возможность изменения длины и ширины после создания
//    public void setHeight(int height) {
//        this.height = height;
//        this.width = height;
//    }
//
//    @Override
//    public void setWidth(int width) {
//        this.width = width;
//        this.height = width;
//    }
}
