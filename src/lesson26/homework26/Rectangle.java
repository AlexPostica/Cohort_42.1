package lesson26.homework26;

public class Rectangle extends Figura {

    private double height;
    private double width;
    public Rectangle(int side) {
        super(side);
    }

    public Rectangle(int side, double height, double width) {
        super(side);
        this.height = height;
        this.width = width;
    }

    @Override
    public double Area() {
        return width * height;
    }

    @Override
    public double Perimeter() {
        return 2 * (width + height);
    }
}
