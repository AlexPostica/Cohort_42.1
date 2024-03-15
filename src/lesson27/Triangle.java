package lesson27;

import lesson26.homework26.Figura;

public class Triangle extends Figura {
    private final double side1;
    private final double side2;
    private final double side3;


    public Triangle(int side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calcArea() {
        double s = calcPerimeter()/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    @Override
    public double calcPerimeter() {
        return side1 + side2 + side3;
    }
}
