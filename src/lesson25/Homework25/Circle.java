package lesson25.Homework25;

public class Circle extends Figura {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calcArea() {
        return Math.PI * radius * radius;
    }
}
