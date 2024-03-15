package lesson27;

import lesson26.homework26.Figura;

public class Rectangle extends Figura {

    private double height;
    private double width;

    public Rectangle(int side, double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (width + height);
    }
}
