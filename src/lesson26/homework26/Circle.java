package lesson26.homework26;

public class Circle extends Figura{
    private final double radius;

    public Circle(int side, double radius) {
        super(side);
        this.radius = radius;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double Perimeter() {
        return 2 * Math.PI * radius;
    }
}
