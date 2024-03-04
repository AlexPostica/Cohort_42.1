package lesson22;

public class TriangleRictange extends Shape2D {
    int a, b;

    @Override
    public double perimeter() {
        return (int) (a + b + Math.sqrt(a*a + b*b));
    }

    @Override
    public double area() {
        return  a * b / 2;
    }
}

