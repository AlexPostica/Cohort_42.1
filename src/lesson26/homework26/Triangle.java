package lesson26.homework26;

public class Triangle extends Figura{
    private final double side1;
    private final double side2;

    public Triangle(int side, double side1, double side2) {
        super(side);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double Area() {
        return (side1 * side2 * side)/2;
    }

    @Override
    public double Perimeter() {
        return side1 + side2 + side;
    }
}
