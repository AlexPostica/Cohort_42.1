package lesson25.Homework25;

public class Triangle extends Figura{
    private double side;

    public Triangle(int side) {
        this.side = side;
    }

    @Override
    protected double calcArea() {
        return (double) (side * side) / 2;
    }
}
